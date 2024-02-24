import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatch {
    public static void main(String[] args) {
        String people = """
                Flinstone, Fredd, 1/1/1900
                Rubble, Barney, 2/2/1905
                Flistone, Wilma, 3/3/1910
                Ruble, Betty, 4/4/1915
                """;
        String regex = "(?<lastName>\\w+),\\s*" +
                "(?<firstName>\\w+),\\s*" +
                "(?<dob>(?<monthBirth>\\d{1,2})/(?<dayBirth>\\d{1,2})/(?<yearBirth>\\d{2,4}))";

        Matcher mat = Pattern.compile(regex).matcher(people);

        while (mat.find()) {
            System.out.printf("%s, %s, %s%n", mat.group("lastName"), mat.group("firstName"), mat.group("dob"));
        }



    }
}
