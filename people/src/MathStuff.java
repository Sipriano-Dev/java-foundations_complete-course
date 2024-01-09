public class MathStuff {

    public static void main(String[] args) {

        System.out.println(calcAreaOfCircle(3));
    }

    /**
     * This Method calculates the area of a circle
     * It uses the formula: PI * r^2
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        //A = PI * r^2
        return Math.PI * Math.pow(radius, 2);
    }
}
