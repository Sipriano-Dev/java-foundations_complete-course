package model;

public class Employee {

    private String name;
    private double salary;
    private String sector;

    private Employee() {
    }

    public Employee(String name, double salary, String sector) {
        this.name = name;
        this.salary = salary;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double increaseClientCreditLimit(Client client) {
        //return the value based in condition
        return 300;

    }

}
