import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of Integers
        Vector<Integer> numbers = new Vector<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Insert element at specific index
        numbers.add(1, 15);  // adds 15 at index 1

        // Access elements
        System.out.println("Element at index 2: " + numbers.get(2));

        // Update element
        numbers.set(2, 25);  // replaces element at index 2 with 25

        // Remove element
        numbers.remove(3);   // removes element at index 3

        // Iterate using for-each
        for (int num : numbers) {
            System.out.println(num);
        }

        // Capacity details
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());
    }
}
