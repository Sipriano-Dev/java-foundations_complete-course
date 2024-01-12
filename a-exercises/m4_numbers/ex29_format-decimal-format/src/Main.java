import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double num1 = 123456.783; //Output: $123,456.78
        double num2 = -9876.32532; //Output: (9,876.325)
        double num3 = 23.19283928394829182; //Output: 2.319284e+01f
        double num4 = 123456; //Output: 0000123456
        double num5 = -9876.35532; //Output: -9,876.4

        String num1f = new DecimalFormat("$#,###.##").format(num1);
        String num2f = new DecimalFormat("(#,###.###;(#)").format(num2);
        String num3f = new DecimalFormat("0.######E00f").format(num3);
        String num4f = new DecimalFormat("0000000000").format(num4);
        String num5f = new DecimalFormat("#,###.#").format(num5);

        System.out.println(num1f);
        System.out.println(num2f);
        System.out.println(num3f);
        System.out.println(num4f);
        System.out.println(num5f);








    }

}