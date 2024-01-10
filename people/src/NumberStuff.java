import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Random;

public class NumberStuff {

    public static void main(String[] args) {

        //Always use this, with string if you want precision
        BigDecimal num = new BigDecimal("127");

        //This way java will use primitive in memory, losing some precision in decimals, and will be slower than
        //Primitive, since you will instantiate a big decimal
        BigDecimal num2 = new BigDecimal(333);

        //Some more ways to instantiate a Big decimal
        BigDecimal num3 = new BigDecimal(333f);
        int num4 = 4;
        BigDecimal num5 = new BigDecimal(num4);

        //You can get the big decimal to other type like int, double, etc
        byte myBite = num.byteValue();
        System.out.println(myBite);

        //Bring the big decimal to string, even if it was instantiated in a String way, it is a big decimal
        String myString = num.toString();





    }
}
