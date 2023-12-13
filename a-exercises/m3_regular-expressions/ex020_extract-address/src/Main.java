import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String address = "Rua 27 n89, Parque floresta 3, Campinas, SP";
        String regex = "(?<logradouro>[\\w\\s]*),\\s?(?<bairro>[\\w\\s]*),\\s?(?<cidade>[\\w\\s]*),\\s?(?<estado>[A-Z]{2})"
                ;

        Matcher mat = Pattern.compile(regex).matcher(address);

        mat.find();
            System.out.println(mat.group("logradouro"));
            System.out.println(mat.group("bairro"));
            System.out.println(mat.group("cidade"));
            System.out.println(mat.group("estado"));


    }
}