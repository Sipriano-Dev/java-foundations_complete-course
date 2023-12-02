public class Main {
    public static void main(String[] args) {

        String text = "     alphabet  ";
        String strippedString = text.strip();
        String formattedString = strippedString.substring(0, strippedString.length() -2)
                + strippedString.substring(strippedString.length() -1)
                .toUpperCase();

        System.out.println(formattedString);
    }
}