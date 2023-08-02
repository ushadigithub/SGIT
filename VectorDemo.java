//java code to illustrate remove()when position of
//element is passed as parameter

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //creating an empty vector
        Vector<String> vector = new Vector<>();
        //use add() to add an elements into the vector
        vector.add("sunny");
        vector.add("vinyl");
        vector.add("adi");
        vector.add("usha");
        vector.add(("apple"));

        System.out.println("Vector: " + vector);
        //Remove the elements using Remove()
        String removedElement;
        removedElement = vector.remove(3);
        System.out.println("Removed element:" + removedElement);
        //print the final vector
        System.out.println("Final vector:" + vector);
    }
}
