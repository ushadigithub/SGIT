public class MinMax {

    static class Node
    {
        int data;
        Node next;
    }
    static Node head = null;
    // Function to find the largest element in the linked list
    static int largestElement(Node head)
    {

        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value
        while (head != null)
        {
            if (max < head.data)
                max = head.data; // Update max if a larger element is found
            head = head.next;
        }
        return max;
    }

    // Function to find the smallest element in the linked list
    static int smallestElement(Node head)
    {
        int min = Integer.MAX_VALUE;// Initialize min to the largest possible value
        while (head != null)
        {
            if (min > head.data)
                min = head.data;// Update min if a smaller element is found
            head = head.next;
        }
        return min;
    }

    // Function to insert a new node at the beginning of the linked list
    static void push(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = (head);
        (head) = newNode;
    }    // Function to print the linked list
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        push( 939);
        push( 767);
        push( 822);
        push( 205);
        System.out.println("Linked list is: ") ;
        printList(head);
        System.out.print("Maximum element in linked list: ");
        System.out.println(largestElement(head));
        System.out.print("Minimum element in linked list: ");
        System.out.print(smallestElement(head));
    }
}

