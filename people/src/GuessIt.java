import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(1, 4);
        System.out.printf("The random number is: %d%n", randomNum);

        if (randomNum == 1) {
            System.out.println("The color is RED");
        } else if (randomNum == 2) {
            System.out.println("The color is BLUE");
        } else {
            System.out.println("The color is BLACK");
        }

    }
}
