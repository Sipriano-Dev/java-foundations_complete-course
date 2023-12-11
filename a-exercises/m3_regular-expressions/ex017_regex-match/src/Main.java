public class Main {
    public static void main(String[] args) {
        //1. Write a regex that would match the following words: Dark, bark, Lark
        System.out.println("Lark".matches("\\wark"));
        // More specific
        System.out.println("Lark".matches("[LDb]ark"));
        // General, but not number
        System.out.println("Lark".matches("[a-zA-Z]ark"));

        //1. For extra challenge, could you additionally make it match: stark
        System.out.println("Stark".matches("\\w\\wark"));
        System.out.println("Stark".matches("[a-zA-Z]{2}ark"));

    }
}