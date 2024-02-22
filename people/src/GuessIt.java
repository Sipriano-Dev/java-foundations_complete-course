import java.util.Random;

public class GuessIt {

    private static final int LIMIT_ALLOWED_TRIED = 5; //Avoid magic numbers

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(1, 11);
        String guessedNumberString = null;
        //This way there's gonna be an exception, because guessedNumberString is null, and cannot call a method equals
        //The solution is to invert and call equal from "q"
//        while (!guessedNumberString.equals("q")) {
        int wrongGuesCount = 1;
        System.out.printf("The random number is %d.%n", randomNum);
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
                    if (wrongGuesCount <= LIMIT_ALLOWED_TRIED) {
                        //It is good to use var instead of magic number
                        System.out.printf("You didn't get it, try again, tries: %d of 5 %n", wrongGuesCount-1);
                    } else {
                        System.out.println("5 of 5 tries, you loose");
                        System.out.printf("The random number is %d.%n", randomNum);
                        return;
                    }

                }
            }
        } while (!"q".equals(guessedNumberString));

    }
}
