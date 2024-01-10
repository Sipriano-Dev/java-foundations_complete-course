import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Random;

public class NumberStuff {

    public static void main(String[] args) {

        //You need this, because maybe this operation will return a long decimal number, so you have to specify a cut off
        //You use this context to solve the error down below
        //You can put that inline too, without instantiate
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);

        //Will be an error, you need to specify a
        //quantity of decimals
        System.out.println(new BigDecimal("35").divide(new BigDecimal(".46"), mc));

        //You have to say the math context to get sqrt
        System.out.println(new BigDecimal("7").sqrt(mc));

        System.out.println(new BigDecimal("7").max(new BigDecimal("9")));

        //This is equal to % module
        System.out.println(new BigDecimal("7").remainder(new BigDecimal("5")));

        //And you can use as a pattern
        System.out.println("-------------------------------");
        System.out.println(new BigDecimal("1").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").remainder(new BigDecimal("2")));
        System.out.println(new BigDecimal("4").remainder(new BigDecimal("2")));



    }
}
