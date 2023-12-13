import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String email = "first.last@domain.com.br";
        String regex = "(?<name>[\\w.-_]+)(?<domain>@[.\\w]+)";

        Matcher mat = Pattern.compile(regex).matcher(email);

        if (mat.matches()) {
            System.out.println(mat.group("name"));
            System.out.println(mat.group("domain"));



        }
    }
}