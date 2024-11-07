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

public class RemoveElementsLinkedList {

    public static Node removeElements(Node head, int value) {
        // Step 1: Remove nodes from the beginning that match the value
        while (head != null && head.data == value) {
            head = head.next;
        }

        // Step 2: Remove nodes in the rest of the list that match the value
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next; // Skip the matching node
            } else {
                current = current.next; // Move to the next node
            }
        }

        return head;
    }

    // Helper method to print a linked list (for testing)
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 6 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        int valueToRemove = 6;
        head = removeElements(head, valueToRemove);

        System.out.println("List after removing value " + valueToRemove + ":");
        printList(head);
    }
}
