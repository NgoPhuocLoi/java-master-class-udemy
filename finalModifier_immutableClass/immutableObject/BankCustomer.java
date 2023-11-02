package immutableObject;

import java.util.ArrayList;
import java.util.List;

import immutableObject.BankAccount.AccoutnType;

public class BankCustomer {
    private static int lastId = 1000;

    private final int id;
    private final String name;
    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String name, double checkingAmount, double savingAmount) {
        this.id = lastId++;
        this.name = name;
        accounts.add(new BankAccount(AccoutnType.CHECKING, checkingAmount));
        accounts.add(new BankAccount(AccoutnType.SAVING, savingAmount));
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", accounts='" + getAccounts() + "'" +
                "}";
    }

}
