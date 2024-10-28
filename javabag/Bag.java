
import java.util.ArrayList;

public class Bag<T> {
    private ArrayList<T> items;
    public Bag() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public boolean contains(T item) {
        return items.contains(item);
    }

    public int count(T item) {
        int count = 0;
        for (T i : items) {
            if (i.equals(item)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return items.toString();
    }

    public static void main(String[] args) {
        // Create an instance of the Bag class.
        Bag<String> bag = new Bag<>();

        // Add several elements to the bag, including duplicates.
        bag.add("mario");
        bag.add("luigi");
        bag.add("toad");
        bag.add("bowser");
        bag.add("luigi");
        bag.add("goomba");

        // Print the bag contents.
        System.out.println("Bag contents: " + bag);
        System.out.println();

        // Test the contains method for a few elements.
        System.out.println("Contains mario? " + bag.contains("mario"));
        System.out.println("Contains toad? " + bag.contains("toad"));
        System.out.println("Contains peach? " + bag.contains("peach"));
        System.out.println();

        // Test the count method for a few elements.
        System.out.println("Count of mario: " + bag.count("mario"));
        System.out.println("Count of luigi: " + bag.count("luigi"));
        System.out.println("Count of peach: " + bag.count("peach"));
        System.out.println();

        // Remove an element from the bag.
        bag.remove("luigi");
        
        // Print the bag contents again.
        System.out.println("Bag contents after removing a luigi: " + bag);
        System.out.println();

        // Test the contains method for the removed element.
        System.out.println("Contains luigi? " + bag.contains("luigi"));
        System.out.println();
        
        // Test the count method for the removed element.
        System.out.println("Count of luigi: " + bag.count("luigi"));
        System.out.println();
    }
}