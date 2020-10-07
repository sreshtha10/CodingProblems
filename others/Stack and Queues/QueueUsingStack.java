import java.util.*;

/* Implementing a queue using two stacks.
	Basic Idea:
	
	Method 1: Making Dequeue() costly O(n) and enqueue O(1).
	1. We will maintain two stacks one named Instack and one named Outstack. 
	
	2. Whenever we have to enqueue a element we push it to the instack. 
	
	3. Outstack is used to dequeue, if outstack is empty we will tranfer all elements from instack to outstack.
	
	4. If outstack is empty we will pop the element to dequeue
	
	Method 2: Making the Enqueue costly O(n) and Dequeue O(1).
	1. If the queue is empty(means S1 is empty), directly push the first element onto the stack S1.
	
	2. If the queue is not empty, move all the elements present in the first stack(S1) to the second stack(S2), one by one. 
	Then add the new element to the first stack, then move back all the elements from the second stack back to the first stack.
	
	3.Doing so will always maintain the right order of the elements in the stack, with the 1st data element staying always at the top,
	with 2nd data element right below it and the new data element will be added to the bottom.
	*/
class Queue{
	Stack<Integer> inStack = new Stack<Integer>();
	Stack<Integer> outStack = new Stack<Integer>();
	public void enqueue(int x) {
		inStack.push(x);
		return;
	}
	public int dequeue() {
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}
	
}
public class Main{
	public static void main(String args[]) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
	}
}
