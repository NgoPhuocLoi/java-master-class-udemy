package synchronization;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Loi", 100000);
        Thread thread1 = new Thread(() -> myAccount.deposit(2500));
        Thread thread2 = new Thread(() -> myAccount.withdraw(5000));
        Thread thread3 = new Thread(() -> myAccount.deposit(2500));
        Thread thread4 = new Thread(() -> myAccount.setName("Phuoc Loi"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("FINAL BALANCE: " + myAccount.getBalance());
    }
}
