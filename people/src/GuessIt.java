import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(1, 4);
        System.out.printf("The random number is: %d%n", randomNum);

//        if (randomNum == 1) {
//            System.out.println("The color is RED");
//        } else if (randomNum == 2) {
//            System.out.println("The color is BLUE");
//        } else if (randomNum == 3) {
//            System.out.println("The color is GREEN");
//        } else {
//            System.out.println("The color is Black");
//        }

        //It works with String and other types too
        switch (randomNum) {
            case 1:
                System.out.println("The color is RED");
                break;
            case 2:
                System.out.println("The color is BLUE");
                break;
            case 3:
                System.out.println("The color is GREEN");
                break;
            case 4:
                System.out.println("The color is BLACK");
                break;
            default:
                System.out.println("The color is PURPLE");
                break;
        }

        String command = null;
        //Don't use this
//        if (command.equals("Stop")) {
//            System.out.println("will be an exception");
//        }

        //Use like this
        if ("Stop".equals(command)) {
            System.out.println("This way will not be an error");
        }

    }
}
