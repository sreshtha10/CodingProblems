import java.util.Scanner;

class Stack{
	int top=-1;
	int size;
	char arr[];
	public Stack(int size) {
		this.size = size;
		this.arr = new char[size];
	}
	public int isEmpty() { 
		if(this.top == -1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public int isFull() {
		if(this.top == this.size -1) {
			System.out.println("Stack Overflow");
			return 1;
		}
		else {
			return 0;
		}
		
	}
	public char pop() {
		if(this.isEmpty() == 1) {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		return arr[top--];
	}
	public void push(char x) {
		if(this.isFull() == 1) {
			return;
		}
		arr[++top] = x;
		return;
	}
	public void printStack() {
		if(isEmpty() == 1) {
			return;
		}
		int p = this.top;
		while(p != -1) {
			System.out.println(arr[p--]);
		}
		return;
	}
}

class PolishNotations{
	String infix;
	String postfix;
	public PolishNotations(String infix) {
		this.infix = infix;
	}
	private int priority(char symbol) {
		switch (symbol) {
		case '^':
			return 3;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '(':
			return 0;
		default:
			return 0;
		}
	}
	
	
	
}
public class Main{
	public static void main(String args[]) {
		Stack s1 = new Stack(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the infix");
		String infix  = sc.nextLine();
	}
}
