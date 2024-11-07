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

public class IntersectionOfTwoLinkedList {

    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Step 1: Get the lengths of both lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Step 2: Align the start of both lists
        if (lenA > lenB) {
            headA = advanceListBy(headA, lenA - lenB);
        } else {
            headB = advanceListBy(headB, lenB - lenA);
        }

        // Step 3: Traverse both lists together until we find the intersection
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; // Intersection found
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection found
    }

    // Helper method to calculate the length of a linked list
    private static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    // Helper method to advance a list by 'count' nodes
    private static Node advanceListBy(Node head, int count) {
        while (count > 0 && head != null) {
            head = head.next;
            count--;
        }
        return head;
    }

    public static void main(String[] args) {
        // Create two lists that intersect
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);
        
        Node list2 = new Node(6);
        list2.next = new Node(7);

        // Create intersection node
        Node intersection = new Node(8);
        intersection.next = new Node(9);

        // Connect intersection to both lists
        list1.next.next.next = intersection;
        list2.next.next = intersection;

        // Find intersection node
        Node result = getIntersectionNode(list1, list2);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}

