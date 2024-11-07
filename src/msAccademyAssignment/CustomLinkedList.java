package msAccademyAssignment;

import java.util.LinkedList;

class Node {
    int data;  // Data part of the node
    Node next; // Pointer to the next node

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomLinkedList {
    private Node head; // Head of the list

    // Constructor to initialize an empty linked list
    public CustomLinkedList() {
        this.head = null;
    }

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Method to remove a node by value
    public boolean remove(int data) {
        if (head == null) {
            return false; // List is empty
        }

        // If the node to be removed is the head
        if (head.data == data) {
            head = head.next; // Move head to the next node
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) { // Node found
                current.next = current.next.next; // Bypass the node to be removed
                return true;
            }
            current = current.next; // Move to the next node
        }
        return false; // Node not found
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }
    
    public void display(Node head) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }
    //ReverseMethod  20 & 49 & 50 number problem
    public Node reverse(Node head) {
    	Node pre=null;
    	Node curr=head;
    	
    	while(curr != null) {
    		Node next=curr.next;
    		curr.next=pre;
    		pre=curr;
    		curr=next;
    		
    	}
    	return pre;
    }
    //Add middle element 21 problem
    public Node addMiddle(Node head, int data) {
    	if(head == null) {
    		return new Node(data);
    	}
    	Node slow=head;
    	Node fast=head;
    	Node pre=null;
    	Node newNode=new Node(data);
    	while(fast != null && fast.next != null) {
    		pre=slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	newNode.next=pre.next;
    	pre.next=newNode;
    	
    	return head;
    }

    // Main method to test the custom linked list
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);

//        System.out.println("Original Linked List:");
//        list.display();
//
//        list.remove(20);
//        System.out.println("After removing 20:");
//        list.display();
//
//        list.remove(10);
//        System.out.println("After removing 10:");
//        list.display();
//
//        list.remove(50); // Trying to remove a non-existent element
//        System.out.println("After trying to remove 50 (not in list):");
        list.display();
//        Node head = list.reverse(list.head);
//        list.display(head);
        
//        Node head=list.addMiddle(list.head, 25);
//        list.display(head);
//        Node head=list.sortLinkedList(list.head);
//        list.display(head);
        Node head=removeNthNodeFromEnd(list.head, 2);
        list.display(head);
        CustomLinkedList list1=new CustomLinkedList();
        list1.add(5);
        list1.add(10);
        list1.add(20);
        
        CustomLinkedList list2=new CustomLinkedList();
        list2.add(7);
        list2.add(12);
        list2.add(28);
        
        head=mergeTwoSortedList(list1.head,list2.head);
        list.display(list1.head);
        list.display(list2.head);
        list.display(head);
        
        System.out.println("Middle element is ==> "+middleElement(head).data);
        System.out.println("Length of LinkedList is ==> "+lenOfLL(head));
        System.out.println("3rd Node from End is ==> "+nthNodeFromEnd(head, 3).data);
        
        head = sumOfTwoLinkedList(list1.head, list2.head, new Node(-1));
        list.display(head);
        
        
        
        
    }
    
    //Sort LinkedList using merge sort o(nlogn) time & o(1) space   problem 22
    public Node sortLinkedList(Node head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	//Find the middle of  the linkedList and call the sortLinkedList recursively for left and right subpart ofLL
    	Node slow=head;
    	Node fast=head;
    	Node temp=head;
    	while(fast != null && fast.next != null) {
    		temp=slow;
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	temp.next=null;
    	Node leftList=sortLinkedList(head);
    	Node rightList=sortLinkedList(slow);
    	
		return merge(leftList,rightList);
    }

	private Node merge(Node leftList, Node rightList) {
		if(leftList == null) return rightList;
		if(rightList == null) return leftList;
		
		Node result;
		if(leftList.data <= rightList.data) {
			result=leftList;
			result.next=merge(result.next, rightList);
		}else {
			result=rightList;
			result.next=merge(leftList, result.next);
		}
		return result;
	}
	
	//38 remove nth node from the end
	public static Node removeNthNodeFromEnd(Node head, int n) {
		int length=0;
		Node temp=head;
		while(temp != null) {
			length++;
			temp=temp.next;
		}
		int targetIndex=length-n;
		if(targetIndex == 0) {
			return head.next;
		}
		temp=head;
		for(int i=1; i<targetIndex; i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
		return head;
	}
	
	//39 Merge two sorted list
	public static Node mergeTwoSortedList(Node list1, Node list2) {
		Node start = new Node(-1);
		Node save=start;
		while(list1 != null && list2 != null) {
			if(list1.data < list2.data) {
				start.next=new Node(list1.data);
				list1=list1.next;
			}else {
				start.next=new Node(list2.data);
				list2=list2.next;
			}
			start=start.next;
		}
		
		if(list1 != null) {
			start.next=list1;
		}
		if(list2 != null) {
			start.next=list2;
		}
		return save.next;
	}
	//47 Middle of the Linked list
	public static Node middleElement(Node head) {
		// Check if the list is empty
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Move fast by two and slow by one until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Slow pointer is now at the middle node
        return slow;
	}
	
	//52 Length of Singly Linked List
	public static int lenOfLL(Node head) {
		if (head == null) return 0;
		int counter=0;
		while (head != null) {
			counter++;
			head=head.next;
		}
		return counter;
	}
	
	public static Node nthNodeFromEnd(Node head, int n) {
		
		//nthNodeFromEnd(head, 3).data)
		int length=0;
		Node temp=head;
		while(temp != null) {
			length++;
			temp=temp.next;
		}
		int targetIndex=length-n;
		if(targetIndex == 0) {
			return head.next;
		}
		temp=head;
		for(int i=1; i<targetIndex; i++) {
			temp=temp.next;
		}
		
		return temp.next;
	}
	//54 problem
	public static Node sumOfTwoLinkedList(Node  list1, Node list2, Node sumNode) {
		int sum=list1.data + list2.data;
		sumNode.data=sum;
		return sumOfTwoLinkedList(list1.next, list2.next, sumNode.next);
	}
}

