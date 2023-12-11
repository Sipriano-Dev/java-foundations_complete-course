import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //2. Use capture groups to write a regex that could match: Abracadabra or Agracadagra
            // a way to refere a repetition group to match
            String regex = "(?<group>A([bg])racada\\2ra)";
            // Other way to backreference
            //String regex = "(?<group>A(?<bg>[bg])racada\\k<bg>ra)";
        String text1 = "Abracadabra";
        String text2 = "Agracadagra";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(text2);

        if (mat.matches()) {
            System.out.println(mat.group("group"));
        }
    }
}