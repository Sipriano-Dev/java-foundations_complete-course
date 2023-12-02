import model.bank.Bank;
import model.bank.BankManager;
import model.Client;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(3000);
        BankManager bankManager = new BankManager("Kratos");
        Client client = new Client("Anderson");

        bankManager.accessVault(bank);


    }
}