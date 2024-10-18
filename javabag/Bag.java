
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
        
    }
}