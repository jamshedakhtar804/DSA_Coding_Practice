package msAccademyAssignment;



public class RemoveDuplicatesSortedList {

    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            // If current node is equal to the next node, skip the next node
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                // Move to the next node if no duplicate
                current = current.next;
            }
        }

        return head;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
