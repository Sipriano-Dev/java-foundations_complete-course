public class Main {
    public static void main(String[] args) {

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int cont = 0;
        for (String s : week) {
            cont += s.length();
        }
        System.out.println("Total char: " + cont);
    }
}