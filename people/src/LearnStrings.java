import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        //LEARN HOW TO USE indexOf()

//        String myText = "BCDEFGABCDEFGA";
//        //Find the unicode representative ch for given code
//        System.out.println(myText.indexOf(65));
//        //If it not find any, it'll return a -1
//        System.out.println(myText.indexOf(122));
//        //Other variation of indexOf, it say where the last occurrence for a given data
//        System.out.println(myText.lastIndexOf("A"));
//        //Tell from where to start
//        System.out.println(myText.indexOf("A", 2));

        //CHALLENGER - Capture the specific snippet code
        String phoneNumber = "(344) 555-7744";

        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);

    }

    private static String parseAreaCode(String phoneNumber) {
        return phoneNumber.substring(phoneNumber.indexOf("(")+1, phoneNumber.indexOf(')'));
    }

    private static String parseExchange(String phoneNumber) {
        return phoneNumber.substring(phoneNumber.indexOf(" ")+1, phoneNumber.indexOf("-"));
    }


    private static String parseLineNumber(String phoneNumber) {
        return phoneNumber.substring(phoneNumber.indexOf("-")+1);
    }




}