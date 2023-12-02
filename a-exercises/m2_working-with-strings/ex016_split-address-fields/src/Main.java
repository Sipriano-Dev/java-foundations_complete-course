public class Main {
    public static void main(String[] args) {

        String address = "12345 Big St., Alphabet City, CA 90210";

        String number = gettingNumber(address);
        String street = gettingStreet(address);
        String city = gettingCity(address);
        String state = gettingState(address);
        String postalCode = gettingPostalCode(address);

        //This optimize the code, telling StringBuilder the amount of space to alocate in memory
        String showAddress = new StringBuilder(address.length())
                .append("1. The building number: ")
                .append(number)
                .append("\n2. The Street: ")
                .append(street)
                .append("\n3. City: ")
                .append(city)
                .append("\n4. State: ")
                .append(state)
                .append("\n5. Postal Code: ")
                .append(postalCode)
                .toString();

        System.out.println(showAddress);
    }

    private static String gettingPostalCode(String address) {
        return address.split(",")[2].split(" ")[2];
    }

    private static String gettingState(String address) {
        return address.split(",")[2].split(" ")[1];
    }

    private static String gettingCity(String address) {
        return address.split(",")[1];
    }

    private static String gettingStreet(String address) {
        return address.split(",")[0].substring(address.indexOf(" "));
    }

    private static String gettingNumber(String address) {
        return address.split(" ")[0];
    }

}