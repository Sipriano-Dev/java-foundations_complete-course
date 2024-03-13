public class Main {
    public static void main(String[] args) {

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int position = 0;

        for (String day : week) {
            String meal = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                default -> "pizza";
            };
            System.out.printf("We eat %s on %s%n", cap(meal), day);
        }
    }

    private static String cap(String s) {
        String[] vet = s.split(" ");
        String word = "";
        for (String ns : vet) {
            String firstLetter = ns.substring(0, 1).toUpperCase();
            String rest = ns.substring(1);
            word += firstLetter + rest + " ";
        }
        return word.stripTrailing();
    }

}