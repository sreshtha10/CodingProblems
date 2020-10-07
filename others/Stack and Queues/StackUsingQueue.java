import java.util.*;
class Stack{
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	// By making the push costly: Push O(n) and Pop is O(1)
	public void push(int x) {
		if(q1.isEmpty()) {
			q1.add(x);
			return;
		}
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(x);
		while(!q2.isEmpty()) {
			q1.add(q2.remove());		
		}
		return;
	}
	public int pop() {
		if(q1.isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return q1.remove();
		
	}
}
public class Main{
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
				}
}
