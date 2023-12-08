public class RegexPractice2 {
    public static void main(String[] args) {
        // . Matches with any character
        System.out.println("Doggy".matches("....."));
        // 0 or more of any character
        System.out.println("Doggy".matches(".*"));
        // 1 or more of any character, you can use ? 0 or 1, etc
        System.out.println("Doggy".matches(".+"));
        // Unlike [^] which means except, outside of bracket
        // means the beginning of a line
        System.out.println("Doggy".matches("^....."));
        // The end of line, I think it matches with \n and in this case
        // is matching with the very end of the string
        System.out.println("Doggy".matches(".....$"));
        // Match the boundering of a string
        System.out.println("Doggy cat".matches(".....\\s\\b..."));
        // The contrary of \\w, this means anything but character
        // characters include letters, underscore and numbers
        System.out.println("---".matches("\\W\\W\\W"));
        // The opposite of numbers, anything but numbers
        System.out.println("asd".matches("\\D\\D\\D"));
        // Non-space, anything but white space
        System.out.println("t".matches("\\S"));
    }
}
