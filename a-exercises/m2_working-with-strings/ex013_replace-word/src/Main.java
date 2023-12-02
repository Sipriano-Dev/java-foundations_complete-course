public class Main {
    public static void main(String[] args) {

        String text = "I've had a cat one time and this cat was my favorite pet ever, it was \"The Cat\"";

        //this way whenever appears "cat" or "Cat" it'll be replaced for "dog" and "Dog" respectively
        //I think this is simpler and more automatic than uses if or index to separate and then concatenate
        System.out.println(text.replace("cat", "dog").replace("Cat", "Dog"));
    }
}