package msAccademyAssignment;

import java.util.HashSet;

//class ListNode {
//    int data;
//    ListNode next;
//
//    ListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class RemoveDuplicatesInUnsortedLinkedList {

    public static void removeDuplicates(ListNode head) {
        if (head == null) return;

        HashSet<Integer> seen = new HashSet<>();
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            // If we've seen this value before, skip the node
            if (seen.contains(current.data)) {
                previous.next = current.next;
            } else {
                // If it's a new value, add it to the set
                seen.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an unsorted linked list with duplicates: 1 -> 2 -> 3 -> 2 -> 4 -> 3 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}

