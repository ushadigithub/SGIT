import java.util.*;

public class VectorSortExample {
    public static void main(String[] args) {
        // Create a Vector to store elements
        Vector<Integer> vector = new Vector<>();

        // Add elements to the Vector
        vector.add(75);
        vector.add(45);
        vector.add(692);
        vector.add(432);
        vector.add(9651);
        vector.add(32);

        System.out.println("Original Vector:");
        System.out.println(vector);

        // Sorting the Vector in ascending order
        Collections.sort(vector);

        System.out.println("Sorted Vector in ascending order:");
        System.out.println(vector);
    }
}
