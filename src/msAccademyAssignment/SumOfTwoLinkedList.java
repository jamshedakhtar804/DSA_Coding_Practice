package msAccademyAssignment;

import java.util.Stack;

public class SumOfTwoLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Push all nodes of list l1 onto stack1
        while (l1 != null) {
            stack1.push(l1.data);
            l1 = l1.next;
        }

        // Push all nodes of list l2 onto stack2
        while (l2 != null) {
            stack2.push(l2.data);
            l2 = l2.next;
        }

        ListNode result = null;
        int carry = 0;

        // Add numbers from stacks
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = carry;

            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }

            // Create a new node with the result of sum % 10
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            // Insert new node at the beginning of the result list
            newNode.next = result;
            result = newNode;
        }

        return result;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating the first linked list: 7 -> 2 -> 4 -> 3 represents the number 7243
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        // Creating the second linked list: 5 -> 6 -> 4 represents the number 564
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Sum should represent 7807 as 7 -> 8 -> 0 -> 7
        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Sum of two numbers:");
        printList(result);
    }
}
