import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        String myText = "This is my text 1";
        String myText2 = "This is my text 2";
//        System.out.println(myText + " " + myText2);

//        System.out.println(myText.concat(myText2));
//        System.out.println("My String".concat("other literal"));

        String finalString = new StringBuilder(myText.length() + 1 + myText2.length())
                .append(myText)
                .append(" ")
                .append(myText2)
                .toString();
        System.out.println(finalString);

        String otherFinalString = new StringBuffer()
                .append(myText)
                .append(" ")
                .append(myText2)
                .toString();
        System.out.println(finalString);

        System.out.format("%s %s\n", myText, myText2);
        String finalSring2 = String.format("%s %s\n", myText, myText2);
        System.out.println(finalSring2);

    }

}