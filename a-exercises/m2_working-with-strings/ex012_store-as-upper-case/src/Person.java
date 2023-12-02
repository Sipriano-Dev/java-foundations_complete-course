public class Person {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
