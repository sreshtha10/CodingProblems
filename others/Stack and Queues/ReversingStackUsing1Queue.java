import java.util.*;

public class Main{
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		reverseStack(stack);
		System.out.println(stack.pop());
		}
	public static void reverseStack(Stack<Integer> stack) {
		Queue<Integer> queue = new LinkedList<>();
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		return;
	}
	
}
