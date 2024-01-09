public class NumberStuff {

    public static void main(String[] args) {

        byte anotherByte = 0x1f; //0x says that it will be an hexadecimal number, in this case will be 31 because
        //when is before another number represents 16 + f(15)
        int anotherInt = 0b01 | 0b10 | 0b100; //0b says that it'll be a binary number, start from right to left
        //The or | says if it has a 1 than the final result is gonna be 1

        System.out.println(anotherInt);
        System.out.println(anotherByte);

    }
}
