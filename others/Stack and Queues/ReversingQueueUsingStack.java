import java.util.*;

public class Main{
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.remove());
		reverseQueue(queue);
		System.out.println(queue.remove());
	}
	public static void reverseQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		return;
	}
	
}
