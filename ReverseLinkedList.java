public class ReverseLinkedList {
    static Node head;
    // Node class to represent individual nodes in the linked list
    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    //function to reverse linked-list
    Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;
        while (current!=null){
            next=current.next;//store the next node
            current.next=prev; // Reverse the link by pointing current's next to the previous node
            prev=current;//move prev and current one step forward
            current=next;//move current and next one step forward
        }
        node=prev ; // Update the head to the last node (which is now the first node after reversing)
        return  node;
    }
    // method to  print content of the   linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list=new ReverseLinkedList();
        ReverseLinkedList.head=new Node(45);
        ReverseLinkedList.head.next=new Node(11);
        ReverseLinkedList.head.next.next=new Node(67);
        ReverseLinkedList.head.next.next.next=new Node(98);
        ReverseLinkedList.head.next.next.next.next=new Node(35);
        System.out.println("Given LinkedList:");
        list.printList(head);
        head=list.reverse(head);//reverse the linked list
        System.out.println(" ");
        System.out.println("Reversed LinkedList:");
        list.printList(head);
    }
}
