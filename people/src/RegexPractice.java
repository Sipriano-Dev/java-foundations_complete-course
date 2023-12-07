import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {

        String regex = """
                # This is my regex to parse parts of phone number
                (?:(?<countryCode>\\d{1,2})[-.,\\s]*)? # Get's country code
                (?:(?<areaCode>\\d{3})[-.,\\s]*) # Get's area code
                (?:(?<exchange>\\d{3})[-.,\\s]*) # Get's exchange
                (?<lineNumber>\\d{4}) # Get's line number
                """;
        
        String phoneNumber = "12.333.544.3455";

        System.out.println(phoneNumber.matches(regex));

        // Putting a Regex expression into a patter object
        // This code says to regex engine to allow comments, but be careful
        // because it's also ignore white spaces literal in regex, so you have to put \\s instead of literal in the regex
        Pattern phonePat = Pattern.compile(regex, Pattern.COMMENTS);
        // Using a variable Patter, uses a method matcher to create a comparison and put inside a Matcher object
        Matcher phoneMat = phonePat.matcher(phoneNumber);


        // If these two matches, then do something
        if (phoneMat.matches()) {
            // The .group(index) method captures the field between ()
            // Notice that the index here starts from 1
            System.out.printf("Country code: %s\n",phoneMat.group("countryCode"));
            System.out.printf("Area code: %s\n", phoneMat.group("areaCode"));
            System.out.printf("Exchange: %s\n", phoneMat.group("exchange"));
            System.out.printf("Line number: %s\n", phoneMat.group("lineNumber"));
        }

    }
}
