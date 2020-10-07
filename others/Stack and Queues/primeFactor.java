import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		Stack<Integer> stack = new Stack<>();
		int num = scanner.nextInt();
		primeFactorisation(num, stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		scanner.close();
	}	
	public static void primeFactorisation(int num,Stack<Integer> stack) {
		if(num == 1) {
			return;
		}
		int i = 2;
		while(num%i!=0) {
			i++;
		}
		stack.push(i);
		primeFactorisation(num/i, stack);
	}
	}
