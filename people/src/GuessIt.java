import java.util.Objects;
import java.util.Random;

public class GuessIt {

    private static final int LIMIT_ALLOWED_TRIED = 5; //Avoid magic numbers

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(1, 11);
        String guessedNumberString = null;

        System.out.printf("The random number is %d.%n", randomNum);

        for (int wrongGuesCount = 1; wrongGuesCount <= LIMIT_ALLOWED_TRIED; wrongGuesCount++) {
            guessedNumberString = System.console().readLine("Please enter with a number between 1 and 10: ");
            if ("q".equals(guessedNumberString)) {
                break;
            }

            if (guessedNumberString.matches("-?\\d+")) {
                int guessedNumber = Integer.parseInt(guessedNumberString);
                if (guessedNumber == randomNum) {
                    String tryText = wrongGuesCount == 1 ? "try" :  "tries";//Ternary is like if, but short and limited
                    System.out.printf("The random number is %d, you got it in %d %s%n", randomNum, wrongGuesCount, tryText);
                    break;//Get out of for loop, return goes back to main method
                } else {

                    if (wrongGuesCount < LIMIT_ALLOWED_TRIED) {
                        System.out.printf("You didn't get it, try again, tries: %d of 5 %n", wrongGuesCount);
                    } else {
                        System.out.println("5 of 5 tries, you loose");
                        System.out.printf("The random number is %d.%n", randomNum);
                        break;
                    }

                }
            }
        }

    }
}
