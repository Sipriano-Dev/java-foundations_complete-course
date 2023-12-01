import model.Client;
import model.Employee;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Anderson Sipriano", "334566");
        Client client1 = new Client("Gabrielle Marcela Ferreira", "556364");
        Employee employee = new Employee("Geralt de Rivia", 4000, "Finance");

        System.out.println(client);
        System.out.println(client1);
        System.out.println("---------------------------");

        client.deposit(2000);
        client.transfer(client1, 800);

        System.out.println(client);
        System.out.println(client1);
        System.out.println("---------------------------");

        client.transfer(client1, 200);

        System.out.println(client);
        System.out.println(client1);
        System.out.println("---------------------------");

        client1.withdraw(300);
        client.askCreditLimit(employee);


        System.out.println(client);
        System.out.println(client1);
        System.out.println("---------------------------");



    }
}