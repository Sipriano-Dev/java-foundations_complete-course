import java.math.BigDecimal;
import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(1, 11);

        while (true) {
            String guessedNumberString = System.console().readLine("Please enter with a number between 1 and 10: ");
            int guessedNumber = Integer.parseInt(guessedNumberString);

            if (guessedNumber == randomNum) {
                System.out.printf("The random number is %d, you win%n", randomNum);
                return;
            } else {
                System.out.printf("you are wrong, try again%n", randomNum);
            }
        }

    }
}
