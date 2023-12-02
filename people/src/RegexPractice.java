public class RegexPractice {

    public static void main(String[] args) {
        // This will compare not considering capital letter
        System.out.println("cat".matches("[Cc]at"));
        // You can use a range that can matches, even more than one range
        System.out.println("cat".matches("[a-zA-Z]at"));
        // ^ Means Except, returns true(matches) any char other than a
        System.out.println("cat".matches("[^a]at"));
        // You can combine those things
        System.out.println("aat".matches("[^a-eA-E]at"));
    }
}
