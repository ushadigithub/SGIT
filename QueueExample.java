
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(77);

        System.out.println("Queue after insertion: " + queue);

        // Delete elements from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after deletion: " + queue);

        // Insert more elements
        queue.add(44);
        queue.add(55);
        queue.add(66);

        System.out.println("Queue after insertion: " + queue);
    }
}
