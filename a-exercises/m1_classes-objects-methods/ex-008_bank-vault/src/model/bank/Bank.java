package model.bank;

public class Bank {

    private double vault;

    public Bank() {
    }

    public Bank(double vault) {
        this.vault = vault;
    }

    public double getVault() {
        return vault;
    }

    void vautAccess() {
        System.out.println("You are in the vault");

    }
}
