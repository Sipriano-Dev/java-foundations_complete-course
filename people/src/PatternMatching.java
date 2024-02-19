public class PatternMatching {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int age) {
        }
        String var1 = "Hello World!";
        Integer var2 = 34;
        String[] var3 = {"Hello", "World"};
        Person var4 = new Person("Jack", "Jhonson", 40);
        Person var5 = new Person("Abe", "Jhonson", 40);
        Object obj = null;

        //This is equivalent to the first case
//        if (obj instanceof String) {
//            String msg = (String) obj;
//            System.out.println(msg.toUpperCase());
//        }

        switch (obj) {
            case null -> System.out.println("It's null");
            case String msg -> System.out.println(msg);
            case Integer num -> System.out.println("Your number is: " + num);
            case Person p when p.firstName.length() > 3 -> System.out.println("Looks like Jake");
            case String[] arr -> System.out.printf("Looks like an array with %d elements", arr.length);
            //case String[] arr -> System.out.println(STR."Looks like an array with \{arr.length} elements");
            //java 21 you can do this way
            default -> System.out.println("Have no idea");
        }

    }
}
