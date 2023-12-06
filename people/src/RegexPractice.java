public class RegexPractice {

    public static void main(String[] args) {
        // Any word character, letter plus underscore and numbers
        // followed by at will match, not symbol
        System.out.println("lat".matches("\\wat"));
        // You can use two words, but pay attention in quantity of character to match
        System.out.println("glat".matches("\\w\\wat"));
        //accept any word with 3 letter and an "a" in the middle and an "a" in the end
        System.out.println("gata".matches("\\wa\\wa"));
        //Any word with 3 letters
        System.out.println("gata".matches("\\w\\w\\w"));

        System.out.println("----------------------------------------");
        // This will match with only numbers
        System.out.println("84643463".matches("\\d\\d\\d\\d\\d\\d\\d\\d"));
        // A phone number match
        System.out.println("333-544-3455".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
        // Telling the repetition's quantity of the same number
        System.out.println("333-544-3455".matches("\\d{3}-\\d{3}-\\d{4}"));
        // Improving the possibilities, accept what is inside of brackets
        System.out.println("333 544 3455".matches("\\d{3}[-. ]\\d{3}[-. ]\\d{4}"));
        // The correct way to accept white spaces \\s
        System.out.println("333 544 3455".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));
        // Expect more than 1 white spaces with +
        System.out.println("333 544 3455".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4}"));
        // Change + from 1 or more for * means 0 or more
        System.out.println("333 544 3455".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{4}"));
        // {3,4} allows 3 to 4 digits
        System.out.println("333 544 3455".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{3,4}"));
        // At least 3 digits, 3 or more
        System.out.println("333 544 3455".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{3,}"));
        // Simplifying repetition
        System.out.println("333 544 3455".matches("(\\d{3}[-.\\s]*){2}\\d{3,}"));
        // To allow 1 or 2 repetition
        System.out.println("544 3455".matches("(\\d{3}[-.\\s]*){1,2}\\d{3,}"));
        // Put one more initial unique digit, but optional, 0 or 1
        System.out.println("1 333 544 3455".matches("(\\d[-.,\\s]+)?(\\d{3}[-.,\\s]*){1,2}\\d{3,}"));
        // The first digit has to be one
        System.out.println("1 333 544 3455".matches("(1[-.,\\s]+)?(\\d{3}[-.,\\s]*){1,2}\\d{3,}"));
    }
}
