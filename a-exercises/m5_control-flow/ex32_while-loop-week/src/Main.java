//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int position = 0;
        while (position < 7) {
            if (position %2 == 0) {
                System.out.println(week[position]);
            } else {
                System.out.println(week[position].toUpperCase());
            }

            position++;
        }

    }
}