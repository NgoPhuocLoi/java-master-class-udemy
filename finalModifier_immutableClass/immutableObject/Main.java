package immutableObject;

public class Main {
    public static void main(String[] args) {
        BankCustomer a = new BankCustomer("Loi", 200, 500);
        System.out.println(a);

        var accounts = a.getAccounts();
        System.out.println("Accoutns: " + accounts);
        accounts.clear();

        System.out.println(a);
    }
}
