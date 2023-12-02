import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {

        String firstWord = "Apple";
        String secondWord = "apple";

        System.out.println(firstWord.compareTo(secondWord));
        System.out.println(firstWord.compareToIgnoreCase(secondWord));

        System.out.println(compareToIgnoreCase(firstWord, secondWord));

    }

    //My own compareToIgnoreCase method heehe
    public static int compareToIgnoreCase(String word1, String word2) {
        return word1.toUpperCase().compareTo(word2.toUpperCase());
    }

}