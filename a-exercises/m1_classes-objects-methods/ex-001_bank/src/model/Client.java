package model;

public class Client {

    private String name;
    private String accountNumber;
    private double creditLimit;
    private double balance;

    private Client() {
    }

    public Client(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void askCreditLimit(Employee employee) {
       this.creditLimit += employee.increaseClientCreditLimit(this);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transfer(Client other, double amount) {
        this.withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", creditLimit=" + creditLimit +
                ", balance=" + balance +
                '}';
    }
}
