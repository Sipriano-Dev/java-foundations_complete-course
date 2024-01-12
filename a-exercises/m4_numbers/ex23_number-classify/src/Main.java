public class Main {

    int[] nuns = {13, 49, 90, 130, 175, 181,
            255, 310, 330, 359};
    int position = 0;

    public int classNumber() {
        return nuns[position++] / 90;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
        System.out.println(main.classNumber());
    }
}