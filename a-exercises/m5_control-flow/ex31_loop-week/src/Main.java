//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < week.length; i++) {

            String output = i % 2 != 0 ? week[i].toUpperCase() : week[i];
            System.out.println(output);
        }

    }
}