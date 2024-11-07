package msAccademyAssignment.dailyAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> queue1=new LinkedList<>();
	Queue<Integer> queue2=new LinkedList<>();
	
	public void push(int x) {
		queue1.add(x);
	}
	
	public int pop() {
		if(queue1.isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		
		while(queue1.size() > 1) {
			queue2.add(queue1.poll());
		}
		int topElement = queue1.poll();
		
		Queue<Integer> temp=queue1;
		queue1=queue2;
		queue2=temp;
		return topElement;
	}
	
	public int top() {
		if(queue1.isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		
		while(queue1.size() > 1) {
			queue2.add(queue1.poll());
		}
		int topElement = queue1.poll();
		
		queue2.add(topElement);
		
		Queue<Integer> temp=queue1;
		queue1=queue2;
		queue2=temp;
		return topElement;
	}
	
	public boolean isEmpty() {
		return queue1.isEmpty();
	}
	

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Print top element
        System.out.println("Top element: " + stack.top()); // Should print 30

        // Pop elements and print them
        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Popped element: " + stack.pop()); // Should print 20

        // Check top element
        System.out.println("Top element: " + stack.top()); // Should print 10

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false

        // Pop last element
        System.out.println("Popped element: " + stack.pop()); // Should print 10

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true
    }

}
