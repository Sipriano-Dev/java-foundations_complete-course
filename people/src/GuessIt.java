import java.math.BigDecimal;
import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(1, 11);
        String guessedNumberString = null;
        //This way there's gonna be an exception, because guessedNumberString is null, and cannot call a method equals
        //The solution is to invert and call equal from "q"
//        while (!guessedNumberString.equals("q")) {
        while (!"q".equals(guessedNumberString)) {
            guessedNumberString = System.console().readLine("Please enter with a number between 1 and 10: ");


            if (guessedNumberString.matches("-?\\d+")) {
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
}
