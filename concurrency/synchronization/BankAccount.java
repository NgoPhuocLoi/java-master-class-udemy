package synchronization;

public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void setName(String name) {

        synchronized (this.name) {
            this.name = name;
            System.out.println("Set name = " + this.name);
        }
    }

    public synchronized void deposit(double amount) {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        double originBalance = balance;
        balance += amount;
        System.out.println(
                "STARTING BALANCE: %.2f, DEPOSIT: %.2f = NEW BALANCE: %.2f".formatted(originBalance, amount, balance));
    }

    public void withdraw(double amount) {
        try {
            System.out.println("Talking with the teller...");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        synchronized (this) {
            double originBalance = balance;
            if (balance >= amount) {
                balance -= amount;
                System.out.println(
                        "STARTING BALANCE: %.2f, WITHDRAWAL: %.2f = NEW BALANCE: %.2f".formatted(originBalance, amount,
                                balance));
            } else {
                System.out.println(
                        "STARTING BALANCE: %.2f, WITHDRAWAL: %.2f => INIFFICENT WITHDRAWAL AMOUNT".formatted(
                                originBalance,
                                amount));
            }
        }

    }
}
