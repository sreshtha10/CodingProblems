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
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		while(!stack.isEmpty()) {
			stack1.push(stack.pop());
		}
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		while(!stack2.isEmpty()) {
			stack.push(stack2.pop());
		}
		return;
	}
	
}
