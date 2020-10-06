import java.util.*;
class Stack{
	int size;
	int[] arr;
	int topB;
	int topA = -1;
	public Stack(int size) {
		this.size = size;
		this.topB = size;
		this.arr = new int[size];
	}
	public void pushA(int x) {
		topA += 1;
		if(this.topA >= this.topB) {
			System.out.println("Stack A Overflow");
			topA -=1;
			return;
		}
		arr[topA] = x;
		return;
		
	}
	
	public int popA() {
		if(topA == -1) {
			System.out.println("Stack A Underflow");
			return -1;
		}
		int x = arr[topA];
		topA-=1;
		return x;
	}
	
	public int peekA() {
		if(topA == -1) {
			System.out.println("Stack A underflow");
			return -1;
		}
		return arr[topA];
	}
	public void displayA() {
		if(topA == -1) {
			System.out.println("Stack A is empty");
			return;
		}
		for(int i=topA;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return;
	}
	public void pushB(int x) {
		topB -= 1;
		if(this.topB <= this.topA) {
			System.out.println("Stack B Overflow");
			topB += 1;
			return;
		}
		arr[this.topB] = x;
		return;
	}
	public int popB() {
		if(this.topB == this.size) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = arr[topB];
		topB += 1;
		return x;
	}
	public int peekB() {
		if(topB == this.size) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[topB];
	}
	public void displayB() {
		if(topB == this.size) {
			System.out.println("Stack B is empty");
			return;
		}
		for(int i=topB;i<this.size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return;
	}
	
	
}
public class Main{
	public static void main(String args[]) {
		Stack stack = new Stack(7);
		stack.pushA(1);
		stack.pushA(2);
		stack.pushA(3);
		stack.pushA(5);
		stack.pushB(6);
		stack.pushB(7);
		stack.pushB(8);
		stack.popA();
		stack.displayB();
		stack.displayA();

	}

}
