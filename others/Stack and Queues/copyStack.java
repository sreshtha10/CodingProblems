import java.util.*;

public class Main{
	public static void main(String args[]) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		copyStack(s1, s2);
		System.out.println(s2.pop());
	}
	public static void copyStack(Stack<Integer> s1, Stack<Integer> s2) {
		Stack<Integer> tmp = new Stack<>();
		while(!s1.isEmpty()) {
			tmp.push(s1.pop());
		}
		while(!tmp.isEmpty()) {
			int x = tmp.pop();
			s1.push(x);
			s2.push(x);
		}
		return;
	}
	
}
