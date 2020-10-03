import java.util.Scanner;
import java.util.Stack;
//Infix to Postfix conversion 
public class Main{
	public static void main(String argsp[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the infix expression");
		String infix = scanner.nextLine();
		String postfixString = infixtoPostfix(infix);
		System.out.println("Postfix : "+postfixString);
		scanner.close();
		return;
		
	}
	public static int priority(char symbol) {
		switch (symbol) {
		case '+':
        case '-':
            return 1;
        case '*':
        case '/':
        case '%' :
            return 2;
        case '^':
            return 3;
        default: return 0;
		}
	}
	public static String infixtoPostfix(String expression) {
		String postfix = "";
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++) {
			char c = expression.charAt(i);
			/*check if char is operator then we will pop all the operators have higher or equal precedence than c a
			push it postfix, and push the operator c in the stack.
			*/
			if(priority(c)>0) {
				while(stack.isEmpty() == false && priority(stack.peek()) >= priority(c)) {
					postfix += stack.pop();
				}
				stack.push(c);
			}
			//if c is right bracket then we will pop() and add that operator to postfix all the elements until we reach left bracket
			else if(c == ')') {
				char x = stack.pop();
				while(x !='(') {
					postfix += x;
					x = stack.pop();
				}
			}
			// if c is left bracket we will push it to the stack
			else if(c == '(') {
				stack.push(c);
				
			// if c is and operand we will add it to the postfix
			}else {
				postfix += c;
			}
		}
		// when scanning is complete if any operator is still in the stack, we will pop() it and add to postfix
		while(stack.isEmpty() != true) {
			postfix += stack.pop();
		}
		return postfix;
	}
	
}
