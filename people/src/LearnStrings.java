import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        //LEARN HOW TO SPLIT STRINGS

        String text = """
                Sipriano,Anderson,1/1/88,89 abc st.,apple,ca
                Ferreira,Gabriell,2/3/95,90 cba st.,orange,sp
                Lourenço,Felipe,3/3/05,91 abc st.,pineapple,sc
                """;
        //Create a string of array that will receive anoter array that the split metho will return
        //based in a regex
        String[] people = text.split("\n");

        //Tell how many people in the array
        System.out.println(people.length);

        //Call the first info people in the array
        System.out.println(people[0]);

        String[] person1 = people[2].split(",");

        //Printing address
        System.out.println(person1[3]);
    }


}