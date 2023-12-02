import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        String first = "apple";
        StringBuffer second = new StringBuffer("apple");

        //It'll return a boolean saying if the two strings are equal in the text
        System.out.println(first.contentEquals(second));
        System.out.println(first.equals(second));
    }


}