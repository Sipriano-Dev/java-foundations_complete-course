import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        //Cutting whitespaces
        String text = "   Anderson    ";
        System.out.printf("'%s'", text.strip());
        System.out.println();
        System.out.printf("'%s'", text.stripLeading());
        System.out.println();
        System.out.printf("'%s'", text.stripTrailing());

        //Cutting whitespaces while indent the code, but ide already do it for us
        String newText = """
                <html>
                    <div> Here is a div space </div>
                </html>
                """;

        System.out.println();
        System.out.println("--------------");

        System.out.println(newText.stripIndent());

        //Show what the method returns
        System.out.printf("'%s'", stripText(text));


    }

    //Creating our own strip method
    public static String stripText(String text) {
        return text.replace(" ", "");
    }
}