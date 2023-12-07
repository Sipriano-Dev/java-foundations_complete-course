import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {

        String regex = "((\\d{1,2})[-.,\\s]*)?((\\d{3})[-.,\\s]*)((\\d{3})[-.,\\s]*)(\\d{4})";
        String phoneNumber = "12.333.544.3455";

        System.out.println(phoneNumber.matches(regex));

        // Putting a Regex expression into a patter object
        Pattern phonePat = Pattern.compile(regex);
        // Using a variable Patter, uses a method matcher to create a comparison and put inside a Matcher object
        Matcher phoneMat = phonePat.matcher(phoneNumber);

        // If these two matches, then do something
        if (phoneMat.matches()) {
            // The .group(index) method captures the field between ()
            // Notice that the index here starts from 1
            System.out.printf("Country code: %s\n",phoneMat.group(2));
            System.out.printf("Area code: %s\n", phoneMat.group(4));
            System.out.printf("Exchange: %s\n", phoneMat.group(6));
            System.out.printf("Line number: %s\n", phoneMat.group(7));
        }

    }
}
