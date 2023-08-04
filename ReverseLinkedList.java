  class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class ReverseLinkedList {
    static Node head;
    static Node reverseLinkedList(Node current) {
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head = new Node(11);
        head.next = new Node(13);
        head.next.next = new Node(23);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(35);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(head);
    }
}






