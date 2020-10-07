import java.util.*;

/* Implementing a queue using two stacks.
	Basic Idea:
	1. We will maintain two stacks one named Instack and one named Outstack. 
	2. Whenever we have to enqueue a element we push it to the instack. 
	3. Outstack is used to dequeue, if outstack is empty we will tranfer all elements from instack to outstack.
	4. If outstack is empty we will pop the element to dequeue */
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
