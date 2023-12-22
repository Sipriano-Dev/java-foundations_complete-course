public class NumberStuff {

    public static void main(String[] args) {
        int myInt = 43; // Range -2,147,483,648 to 2,147,483,647 (2 bilions) 4 bytes = 32 bits
        long myLont = 3566; //Range -9,223,372,036,854,775,808 to 9,223.372,036,854,775,807 (8 Byte = 64 bits)
        double myDouble = 3.141592; // The IDE take double as default
        float myFloat = 3.141592f; // Because of this, you put an f to indicate it is a float, not double

        double num1 = 2.15;
        double num2 = 1.10;
        System.out.println(num1 - num2); //1.0499999999999998, it is supposed to print a 1.05

        float num3 = 2.15f;
        float num4 = 1.10f;
        System.out.println(num3 - num4); //1.0500001, it always be aproximated result,

    }
}
