
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

    // Returns the total number of elements in the bag
    public int size() {
        return items.size();
    }

    // Merges the elements of another bag into the current bag
    public void merge(Bag<T> otherBag) {
        this.items.addAll(otherBag.items);
    }

    // Returns a new bag containing only the distinct elements from the current bag
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (T item : items) {
            if (!distinctBag.contains(item)) {
                distinctBag.add(item);
            }
        }
        return distinctBag;
    }

    @Override
    public String toString() {
        return items.toString();
    }

    public static void main(String[] args) {
        // Create two instances of the Bag class.
        Bag<String> bag1 = new Bag<>();
        Bag<String> bag2 = new Bag<>();

        // Add elements to each bag, including duplicates.
        bag1.add("mario");
        bag1.add("luigi");
        bag1.add("toad");
        bag1.add("luigi");
        
        bag2.add("peach");
        bag2.add("mario");
        bag2.add("yoshi");
        bag2.add("peach");
        bag2.add("peach");

        // Print the size of each bag.
        System.out.println("Size of bag1: " + bag1.size());
        System.out.println("Size of bag2: " + bag2.size());
        System.out.println();

        // Merge the two bags.
        bag1.merge(bag2);
        System.out.println("Merged bag contents: " + bag1);
        System.out.println();

        // Create a new bag with distinct elements.
        Bag<String> distinctBag = bag1.distinct();
        System.out.println("Distinct bag contents: " + distinctBag);
        System.out.println();
    }
}