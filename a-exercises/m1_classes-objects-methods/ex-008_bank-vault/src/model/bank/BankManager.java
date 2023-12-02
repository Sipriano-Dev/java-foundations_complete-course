package model.bank;

public class BankManager {

    private String name;

    public BankManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accessVault(Bank bank) {
        bank.vautAccess();
    }
}
