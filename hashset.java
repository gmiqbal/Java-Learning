import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> fruitnames = new HashSet<String>();
        fruitnames.add("Apple");
        fruitnames.add("Banana");
        fruitnames.add("Mango");
        fruitnames.add("Strawberry");
        fruitnames.add("Pineapple");

        System.out.println(fruitnames);

        fruitnames.remove("Apple");
        fruitnames.remove("Pineapple");
        System.out.println("Size: " + fruitnames.size());

        fruitnames.clear();
        System.out.println(fruitnames);
        boolean boo = fruitnames.isEmpty();
        System.out.println(boo);

    }
}
