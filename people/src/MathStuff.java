import java.util.Scanner;

public class MathStuff {

    public static void main(String[] args) {


        double radius = 0.8;
        double period = 3.0;
        double masssOfBall = 0.2;

        double pathVelocity = calculatePathVelocity(radius, period);
        System.out.println(pathVelocity);

        double ac = calculateCentripetalAcceleration(pathVelocity, radius);
        System.out.println(ac);

        double fc = calculateCentripetalForce(masssOfBall, ac);
        System.out.println(fc);

        double fc2 = calculateCentripetalForce(masssOfBall, radius, period);
        System.out.println(fc2);

    }

    private static double calculatePathVelocity(double radius, double period) {
        //Path velocity = 2 * PI * r / period
        double circumference = 2 * Math.PI * radius;
        return circumference / period;
    }

    private static double calculateCentripetalAcceleration(double pathVelocity, double radius) {
        //Centripetal Acceleration = PathVelocity^2 / radius;
        return Math.pow(pathVelocity, 2) / radius;
    }

    private static double calculateCentripetalForce(double masssOfBall, double ac) {
        //Centripetal Force = Mass of Ball * Centripetal Acceleration
        return masssOfBall * ac;
    }

    public static double calculateCentripetalForce(double masssOfBall, double radius, double period) {
        double pathVelocity = calculatePathVelocity(radius, period);
        double ac = calculateCentripetalAcceleration(pathVelocity, radius);
        double fc = calculateCentripetalForce(masssOfBall, ac);
        return fc;
    }

    //This method doesn't need anything other method, only the variables
//    public static double calculateCentripetalForce(double masssOfBall, double radius, double period) {
//        double pathVelocity = 2 * Math.PI * radius / period;
//        double ac = Math.pow(pathVelocity, 2) / radius;
//        return masssOfBall * ac;
//    }
}
