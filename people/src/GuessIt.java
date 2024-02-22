import java.math.BigDecimal;
import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(1, 11);
        System.out.printf("The random number is %d.%n", randomNum);
        String guessedNumberString = null;
        //This way there's gonna be an exception, because guessedNumberString is null, and cannot call a method equals
        //The solution is to invert and call equal from "q"
//        while (!guessedNumberString.equals("q")) {
        int wrongGuesCount = 1;
        do {
            //int wrongGuesCount = 1;//This will not count, because every time will set to 1 again
            //and it will exists only inside of the block
            guessedNumberString = System.console().readLine("Please enter with a number between 1 and 10: ");
            //This way, you have to build ctrl+f9 and use terminal to run

            if (guessedNumberString.matches("-?\\d+")) {
                int guessedNumber = Integer.parseInt(guessedNumberString);
                if (guessedNumber == randomNum) {
                    String tryText = wrongGuesCount == 1 ? "try" :  "tries";//Ternary is like if, but short and limited
                    System.out.printf("The random number is %d, you got it in %d %s%n", randomNum, wrongGuesCount, tryText);
                    return; //That finish the do/while code
                } else {
                    wrongGuesCount++;
                    System.out.printf("You didn't get it, try again%n");

                }
            }
        } while (!"q".equals(guessedNumberString));

    }
}
