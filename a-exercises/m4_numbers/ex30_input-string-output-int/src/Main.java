public class Main {
    public static void main(String[] args) {
        System.out.println(sum("37", "13"));
    }

    public static int sum(String s1, String s2) {
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        return n1 + n2;
    }

}