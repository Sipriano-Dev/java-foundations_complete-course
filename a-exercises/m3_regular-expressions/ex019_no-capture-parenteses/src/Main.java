import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // 3. How can you use parentheses in a regex for grouping but without capturing?

        Matcher mat = Pattern.compile("(?<group1>[\\w\\s]+)\\((?<group2>[\\w\\s]+)\\)").matcher("No capture (this)");

        if (mat.matches()) {
            System.out.print(mat.group("group1"));
            System.out.println(mat.group("group2"));
        }
    }
}