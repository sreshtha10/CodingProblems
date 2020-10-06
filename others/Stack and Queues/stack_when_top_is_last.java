import java.util.*;
class Stack{
	int size;
	int[] arr;
	int top;
	public Stack(int size) {
		this.size = size;
		this.top = size;
		this.arr = new int[size];
	}
	
	public void push(int x) {
		if(this.top == 0) {
			System.out.println("Stack Overflow");
			return;
		}
		this.top -= 1;
		arr[this.top] = x;
		return;
	}
	public int pop() {
		if(this.top == this.size) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = arr[top];
		top += 1;
		return x;
	}
	public int peek() {
		if(top == this.size) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top];
	}
	public void display() {
		if(top == this.size) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i=top;i<this.size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return;
	}
	
	
}
public class Main{
	public static void main(String args[]) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.display();
	}

}
