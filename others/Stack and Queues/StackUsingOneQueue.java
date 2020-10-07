import java.util.*;
class Stack{
	Queue<Integer> q1 = new LinkedList<>();
	public void push(int x) {
		
		int y = q1.size();
		q1.add(x);
		while(y != 0) {
			q1.add(q1.remove());
			y -= 1;
		}
	}
	public int pop() {
		if(q1.isEmpty()) {
			System.out.println("Queue Underflow");
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
