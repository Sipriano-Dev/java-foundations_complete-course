public class Main {
    public static void main(String[] args) {

        People f1 = new People();
        People f2 = new People();
        People f3 = new People();

        System.out.println(f1.getFriends()[0]);
        System.out.println(f1.getFriends()[1]);
        System.out.println(f1.getFriends()[2]);

        System.out.println(f2.getFriends()[0]);
        System.out.println(f2.getFriends()[1]);
        System.out.println(f2.getFriends()[2]);

        System.out.println(f3.getFriends()[0]);
        System.out.println(f3.getFriends()[1]);
        System.out.println(f3.getFriends()[2]);

    }
}