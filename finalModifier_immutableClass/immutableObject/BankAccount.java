package immutableObject;

public class BankAccount {
    public enum AccoutnType {
        CHECKING, SAVING
    }

    private final AccoutnType accoutnType;
    private double balance;

    public BankAccount(AccoutnType accoutnType, double balance) {
        this.accoutnType = accoutnType;
        this.balance = balance;
    }

    public AccoutnType getAccoutnType() {
        return this.accoutnType;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "{" +
                " accoutnType='" + getAccoutnType() + "'" +
                ", balance='" + getBalance() + "'" +
                "}";
    }

}
