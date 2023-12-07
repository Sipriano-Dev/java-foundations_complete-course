import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {

        String regex = "(1[-.,\\s]+)?(\\d{3}[-.,\\s]*)(\\d{3}[-.,\\s]*)\\d{4}";
        String phoneNumber = "1.333.544.3455";

        System.out.println(phoneNumber.matches(regex));

        // Putting a Regex expression into a patter object
        Pattern phonePat = Pattern.compile(regex);
        // Using a variable Patter, uses a method matcher to create a comparison and put inside a Matcher object
        Matcher phoneMat = phonePat.matcher(phoneNumber);

        // If these two matches, then do something
        if (phoneMat.matches()) {
            // The .group(index) method captures the field between ()
            // Notice that the index here starts from 1
            System.out.println(phoneMat.group(1));
            System.out.println(phoneMat.group(2));
            System.out.println(phoneMat.group(3));
        }

    }
}
