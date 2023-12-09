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
        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<monthBirth>\\d{1,2})/(?<dayBirth>\\d{1,2})/(?<yearBirth>\\d{2,4}).*";

        Matcher mat = Pattern.compile(regex).matcher(people);

        // Start the beginning and will find any match and move to subsequent match
        // Notice that after a break line, you use anoter find()
        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("monthBirth"));
        System.out.println(mat.group("dayBirth"));
        System.out.println(mat.group("yearBirth"));
        // this show where index start and ends, in this case will be this
        // Flinstone, Fredd, 1/1/1900 0 - 26
        System.out.println(mat.start());
        System.out.println(mat.end());
        // It serves also to get index of capture groups, like down below
        System.out.println(mat.start("firstName"));
        System.out.println(mat.end("firstName"));

        // I will see that other mat.find already find the previous sequence matches
        // and will capture the next one
        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("monthBirth"));
        System.out.println(mat.group("dayBirth"));
        System.out.println(mat.group("yearBirth"));

        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("monthBirth"));
        System.out.println(mat.group("dayBirth"));
        System.out.println(mat.group("yearBirth"));

        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("monthBirth"));
        System.out.println(mat.group("dayBirth"));
        System.out.println(mat.group("yearBirth"));


    }
}
