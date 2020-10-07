import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the decimal Number");
		Stack<Integer> stack = new Stack<>();
		int dec = scanner.nextInt();
		binaryConversion(stack, dec);
		while(!stack.isEmpty()) {
			System.out.print((int)stack.pop()+" ");
		}
		
	}
	public static void binaryConversion(Stack<Integer> stack,int dec) {
		if(dec == 0) {
			stack.push(0);
			return;
		}
		if(dec == 1) {
			stack.push(1);
			return;
		}
		int x = dec%2;
		stack.push((x));
		dec = (int)(dec/2);
		binaryConversion(stack, dec);
	}
	
}
