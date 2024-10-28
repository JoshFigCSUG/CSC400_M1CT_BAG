public class BagTest {
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