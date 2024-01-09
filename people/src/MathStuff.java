public class MathStuff {

    public static void main(String[] args) {
        System.out.println(3 + 5);
        System.out.println(3 - 5);
        System.out.println(3 * 5);
        System.out.println(3 / 5);
        //Precedence order here
        // 1. * /
        // 2. + -

        System.out.println(7 / 4); //will be 1, because it is two integer, so the result will be integer
        // to solve this, you have to put a double or float in one of two number or both 7.0 / 4 = 1.75
        // of an f 7f / 4 = 1.75
        // or cast (double)7f / 4 = 1.75

        System.out.println((double)(7 / 4)); // In this case the result will be 1.0 because first will be a calculation
        // and the result will be casting

        System.out.println(5 * ((3d + 2d) / 10)); // You can put a d to say it is a double number
        //Precedence order here
        // 1. (){}
        // 2. * /
        // 3. + -

        System.out.println(4 % 2); //This is a module operation, will return the rest of the division, 0 in this case

        // You can use a module operation to make a pattern saying that the sequence wil be 1 and 0 1 and 0
        System.out.println(1 % 2);
        System.out.println(2 % 2);
        System.out.println(3 % 2);
        System.out.println(4 % 2);
        System.out.println(5 % 2);
        System.out.println(6 % 2);
        System.out.println(7 % 2);
        System.out.println(8 % 2);
        System.out.println(9 % 2);
        System.out.println(10 % 2);

        // Or in each 3 numbers will be a pattern of 0, 1, 2
        System.out.println(1 % 3);
        System.out.println(2 % 3);
        System.out.println(3 % 3);
        System.out.println(4 % 3);
        System.out.println(5 % 3);
        System.out.println(6 % 3);
        System.out.println(7 % 3);
        System.out.println(8 % 3);
        System.out.println(9 % 3);
        System.out.println(10 % 3);

        System.out.println("-----------------------");
        int x = 1;
        System.out.println(x);
        //x = x + 1;
        //x+=1;
        x++; //Just for one you can use this, for others, use this x+=3
        System.out.println(x);

        System.out.println("----------------------------");
        System.out.println(x++); //Will print and after that will add a number 1
        System.out.println(++x); //Will add a number 1 and after that will print

        System.out.println("--------------------------------");
        boolean myFlag = true;
        System.out.println(myFlag);
        myFlag = !myFlag;
        System.out.println(myFlag); //! means not, reverse the result, flipping it
    }
}
