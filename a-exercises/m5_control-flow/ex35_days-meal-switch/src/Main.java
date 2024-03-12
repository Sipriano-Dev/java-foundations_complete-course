//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int position = 0;
        switch (week[position]) {
            case "Sunday":
                System.out.println("We eat pot roast on Sunday");
            case "Monday":
                System.out.println("We eat spaghetti on Monday ");
            case "Tuesday":
                System.out.println("We eat tacos on Tuesday");
            case "Wednesday":
                System.out.println("We eat chicken on Wednesday");
            case "Thursday":
                System.out.println("We eat meatloaf on Thursday");
            case "Friday":
                System.out.println("We eat hamburger on Friday");
            case "Saturday":
                System.out.println("We eat Pizza on Saturday");
        }
    }
}