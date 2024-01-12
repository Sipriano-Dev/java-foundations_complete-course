import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double num1 = 123456.783; //Output: $123,456.78
        double num2 = -9876.32532; //Output: (9,876.325)
        double num3 = 23.19283928394829182; //Output: 2.319284e+01f
        double num4 = 123456; //Output: 0000123456
        double num5 = -9876.35532; //Output: -9,876.4

        //, says to separate every 3 numbers
        System.out.printf("$%,.2f%n", num1);
        //( put a the whole number inside a ()
        System.out.printf("$%(,.3f%n", num2);
        //e show in a some math way
        System.out.printf("%ef%n", num3);
        // the second 0 says no decimals
        System.out.printf("0000%.0f%n", num4);
        System.out.printf("%,.1f", num5);





    }

}