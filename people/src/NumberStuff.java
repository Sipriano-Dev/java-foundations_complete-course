import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Random;

public class NumberStuff {

    public static void main(String[] args) {


        float num1 = 2.15f;
        float num2 = 1.10f;
        System.out.println(num1 - num2);

        //Best way to instantiate a bigdecimal is with string, to avoid the unprecise round
        BigDecimal num3 = new BigDecimal("2.15");
        BigDecimal num4 = new BigDecimal("1.10");
        //System.out.println(num3 - num4); //You can't do this because it will work only with primitive
        System.out.println(num3.subtract(num4));
        //When you want precision, to money for example, uses big decimal
        //The use of the float and double, is because it is faster

    }
}
