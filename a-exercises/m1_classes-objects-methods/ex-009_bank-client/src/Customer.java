public class Customer {

    private String name;
    private double initialDeposit;

    //Only with this constructor, the Customer will have to have a name and
    //Initial deposit to be created
    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.initialDeposit = initialDeposit;
    }
}
