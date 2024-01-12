import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double num1 = 123456.783; //Output: $123,456.78
        double num2 = -9876.32532; //Output: (9,876.325)
        double num3 = 23.19283928394829182; //Output: 2.319284e+01f
        double num4 = 123456; //Output: 0000123456
        double num5 = -9876.35532; //Output: -9,876.4

        String num1f = String.format("$%,.2f%n", num1);
        String num2f = String.format("$%(,.3f%n", num2);
        String num3f = String.format("%ef%n", num3);
        String num4f = String.format("0000%.0f%n", num4);
        String num5f = String.format("%,.1f%n", num5);







    }

}