package msAccademyAssignment;


//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class PartitionLinkedList {

    public static Node partition(Node head, int x) {
        // Create two dummy nodes to start the less and greater lists
        Node lessHead = new Node(0);
        Node greaterHead = new Node(0);

        // Pointers to build the two lists
        Node less = lessHead;
        Node greater = greaterHead;

        // Traverse the list and partition the nodes
        while (head != null) {
            if (head.data < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        // Combine the lists
        greater.next = null;    // End the greater list
        less.next = greaterHead.next; // Connect less list to the start of the greater list

        return lessHead.next; // The new head is the start of the less list
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Original list:");
        printList(head);

        int x = 3;
        head = partition(head, x);

        System.out.println("List after partitioning around " + x + ":");
        printList(head);
    }
}
