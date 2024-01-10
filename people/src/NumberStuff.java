
public class NumberStuff {

    public static void main(String[] args) {

        int myInt = 7;
        //Auto-boxing, but you don't need, you can do it direct
        //Integer myInteger = num1; java do auto-boxing automatically
        //You can use Wrapper classes with double, float an son on
        Integer myInteger = Integer.valueOf(myInt);
        //In this case, you need the valueOf, because you are passing a string
        //With byte, is necessary using an string
        Double myDouble = Double.valueOf("2.0");
        storeData(myInt);

        //This is how you can parse a String to a int, or a double or a boolena, etc
        //Internally, Integer is using valueOf to parse Integer to int
        int age = Integer.parseInt(args[0]);

        System.out.println(age + 15);


    }

    /**
     * Takes in any type of data and stores in somewhere generically
     */
    public static void storeData(Object obj) {
        System.out.println("ola");
    }

}
