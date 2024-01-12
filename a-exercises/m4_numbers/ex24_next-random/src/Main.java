import java.util.Random;

public class Main {

    int sum = 0;
    public int randomGenerator() {
        sum += new Random().nextInt(10);
        return sum;
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
        System.out.println(main.randomGenerator());
    }
}