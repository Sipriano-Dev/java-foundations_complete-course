public class MathStuff {

    public static void main(String[] args) {
        System.out.println(Math.abs(-5)); //Returns the absolute number
        System.out.println(Math.ceil(5.1)); //It will round up to 6
        System.out.println(Math.floor(5.9)); //It will round down to 5
        System.out.println(Math.min(3, 6)); //It will return the smallest number
        System.out.println(Math.max(3, 6)); //It will return the biggest number
        System.out.println(Math.pow(2, 3)); //To power a number

        System.out.println(Math.random()); //To Random number, but for simple things, not trust for important things
        System.out.println((int)Math.round((Math.random() * 25))); //Improve to get from 1 to 25 with int result
        // Note that is surround by (), because the result * 26 will be casting
        // Math.round() round a number if is 1.5 or more will be rounded to 2, if it is 1.49 or less will be 1

    }
}
