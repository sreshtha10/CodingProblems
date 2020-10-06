import java.util.*;
class Stack{
	int size;
	int[] arr;
	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		// TODO Auto-generated constructor stub
	}
	private int len = 0;
	final private int top = 0;
	public void push(int x) {
		if(len == this.size) {
			System.out.println("Stack Overflow");
			return;
		}
		if(arr[top] == 0) {
			arr[top] =x;
			len++;
			return;
		}
		rotateRight(arr);
		arr[top] = x;
		len++;
		return;
		
	}
	public void display() {
		if(arr[top] == 0) {
			System.out.println("Stack is empty");
			return;
		}
		
		for(int i=0;i<this.len;i++) {
			System.out.print(arr[i]+" ");
		}
		
		return;
		
	}
	public int pop(){
		if(arr[top] == 0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = arr[top];
		rotateLeft(arr);
		len--;
		return x;
		
	}
	
	public int peek() {
		if(arr[top] == 0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top];
	}
	
	public static int[] rotateLeft(int[] arr) {
		int a,tmp = arr[arr.length-1];
		for(int i =arr.length-1;i>=0;i--) {
			if(i!=0) {
				a = tmp;
				tmp = arr[i-1];
				arr[i-1] = a;
			}
			else {
				arr[arr.length-1] = tmp;
			}
		}
		return arr;
	}
	public static int[] rotateRight(int[] arr) {
		int a,tmp = arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(i != arr.length-1) {
				a = tmp;
				tmp = arr[i+1];
				arr[i+1] = a;
			}
			else {
				arr[0] = tmp;
			}
		}
		return arr;
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
