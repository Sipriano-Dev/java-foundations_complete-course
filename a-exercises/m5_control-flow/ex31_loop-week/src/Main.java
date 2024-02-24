//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < week.length; i++) {
            if (i % 2 != 0) {
                System.out.println(week[i].toUpperCase());
            } else {
                System.out.println(week[i]);
            }

        }

    }
}