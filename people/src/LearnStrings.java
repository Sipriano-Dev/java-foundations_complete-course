public class LearnStrings {
    public static void main(String[] args) {

        //This will contain the same reference, because are literals
        String fruit = "Banana";
        String anotherFruit = "Banana";

        //This will contain different references, because are different objects
        String vegetable = new String("Broccoli");
        String anotherVegetable = new String("Broccoli");

        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable == anotherVegetable);

    }
}