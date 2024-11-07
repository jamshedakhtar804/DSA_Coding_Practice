package msAccademyAssignment;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLinkedListCycle {

    // Method to detect cycle and return the starting node of the cycle if it exists
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect if there is a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {
                // Find the starting node of the cycle
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Starting node of the cycle
            }
        }

        return null; // No cycle
    }

    public static void main(String[] args) {
        // Creating a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next; // Creates a cycle (3 -> 4 -> 5 -> 3)

        ListNode cycleStartNode = detectCycle(head);

        if (cycleStartNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleStartNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
