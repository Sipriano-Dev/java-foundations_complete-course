//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String meal = "";

        for (String day : week) {
            if ("Sunday".equals(day)) {
                meal = " pot roast";
            } else if ("Monday". equals(day)) {
                meal = "spaghetti";
            } else if ("Tuesday".equals(day)) {
                meal = "tacos";
            } else if ("Wednesday".equals(day)) {
                meal = "chicken";
            } else if ("Thursday".equals(day)) {
                meal = "meatloaf";
            } else if ("Friday".equals(day)) {
                meal = " hamburgers";
            }else {
                meal = "pizza";
            }
            System.out.println("We eat " + meal + " on " + day);
        }
    }
}