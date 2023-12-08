import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """

                Student\\sNumber:\\s*(?<studentNumber>\\d{10}).* # Grab studend number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab Grade
                Birthdate:\\s+(?<birthMonth>\\d{1,2})[/.\\s-,](?<birthDay>\\d{1,2})[/.\\s-,](?<birthYear>\\d{2,4}).* # Grab Birthdate
                Gender:\\s+(?<gender>\\w+)\\b.* # Grab Grade, prevente new genders
                State\\sID:\\s+(?<stateId>\\d{10})\\b.* # Grab Grade, prevente new genders
                Cumulative\\sGPA\\s\\(Weighted\\)\\s+(?<weighted>[\\d.]+)\\b.* # Grab the cumulative GPA Weighed
                Cumulative\\sGPA\\s\\(Unweighted\\)\\s+(?<unweighted>[\\d.]+)\\b.* # Grab the cumulative GPA Unweighted
                .* 
                """;

        // It says to regex enable "." to consider everything, because some elements like \n
        // it not consider
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);
        if (mat.matches()) {
            System.out.println(mat.group("studentNumber"));
            System.out.println(mat.group("grade"));
            System.out.print(mat.group("birthMonth"));
            System.out.print("/");
            System.out.print(mat.group("birthDay"));
            System.out.print("/");
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateId"));
            System.out.println(mat.group("weighted"));
            System.out.println(mat.group("unweighted"));
        }

    }
}
