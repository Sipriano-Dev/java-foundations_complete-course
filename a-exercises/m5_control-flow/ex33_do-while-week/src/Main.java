//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int position = 0;
         do {

        String output = position % 2 == 0 ? week[position] : week[position].toUpperCase();
        System.out.println(output);

        position++;
    } while (position < 7);

    }
}