import java.security.SecureRandom;
import java.util.Random;

public class NumberStuff {

    public static void main(String[] args) {

        Random random = new Random(3436346); //seed if you want
        System.out.println(random.nextInt(25)); //It better than Math.random()

        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt(25));
        //Can put a seed too, it's like random but better in security

    }
}
