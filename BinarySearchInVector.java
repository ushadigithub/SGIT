import java.util.Vector;

public class BinarySearchInVector {
    //call the binarySearchHelper function with initial parameters
    public static int binarySearch(Vector<Integer> vector, int target) {
        return binarySearchHelper(vector, target, 0, vector.size() - 1);
    }

    private static int binarySearchHelper(Vector<Integer> vector, int target, int low, int high) {
        if (low <= high) {
            //search if the current range vector is valid
            int mid = low + (high - low) / 2;
            //compare the middle element with the target
            if (vector.get(mid) == target) {
                return mid;//Target fount at middle index
            } else if (vector.get(mid) < target) {
                //if the middle element is lesson than the target element
                //recursively search the element in the right half of the range
                return binarySearchHelper(vector, target, mid + 1, high);
            } else {
                //if the middle element is greater than the target element
                //recursively search the element at left half of the range
                return binarySearchHelper(vector, target, low, mid - 1);
            }
        }
        //target not found in the current search range
        return -1;
    }

    public static void main(String[] args) {
        //create a vector and add elements to it
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        //define target element to search for
        int targetElement = 8;
        //perform binary search and get the result
        int result = binarySearch(vector, targetElement);
       // display the result of the search
        if (result != -1) {
            System.out.println("Element" + targetElement + "found at index" + result + "in the vector:");
        } else {
            System.out.println("Element" + targetElement + "not found at index" + result + "in the vector:");
        }
    }
}