import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        String myText = "developer";

        //CAPITALIZING THE FIRST LETTER

        //used for few strings
        String myNewTextPlus = myText.substring(0, 1).toUpperCase() + myText.substring(1);
        System.out.println(myNewTextPlus);

        //similar to "+" in performance
        String myNewTextConcat = myText.substring(0, 1).toUpperCase().concat(myText.substring(1));
        System.out.println(myNewTextConcat);

        //Efficient in memory
        String myNewText = new StringBuilder(myText.length())
                .append(myText.substring(0, 1).toUpperCase())
                .append(myText.substring(1))
                .toString();
        System.out.println(myNewText);


    }

}