import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

//        String myText = "For score and seven years ago";
//        System.out.println(myText.length());
//        char[] charArray = myText.toCharArray();
//        int index = 30;
//        if (index < myText.length()) {
//            System.out.println(charArray[index]);

        String text = "For";
        String text2 = "score";

        StringBuilder builder = new StringBuilder(text.length() + text2.length())
                .append(text)
                .append(text2);
        System.out.println(builder.length());



    }

}