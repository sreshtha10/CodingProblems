// checking the validity of an expression using stack.
import java.util.Scanner;
class Stack{
    int size;
    char[] arr;
    Stack(int size){
        this.size = size;
        this.arr = new char[size];
    }
    public int top = -1;
    int length = 0;
    public void push(char x){
        if(this.length == size-1){
            return; //Stack Overflow.
        }
        top += 1;
        this.length++;
        this.arr[this.top]  = x;
        return;
    }
    public char pop(){
        if(this.length == 0){
            System.exit(1); // Stack Underflow.
        }
        char x = this.arr[this.top];
        this.top -= 1;
        this.length--;
        return x;
    }
    public void printStack(){
        int x = this.top;
        while(x != -1){
            System.out.print(this.arr[x--]+" ");
        }
        return;
    }
    public int isEmpty(){
        if(this.top == -1){
            return 1;
        }
        return 0;
    }
}


public class Main{


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        int valid  = check(expression);
        if(valid == 1){
            System.out.println("Valid expression");
        }
        else{
            System.out.println("Invalid expression");
        }

    }



    public static int match(char a,char b){
        if(a == '(' && b ==')'){
            return 1;
        }
        else if(a == '{'&& b=='}'){
            return 1;
        }
        else if(a=='[' && b==']'){
            return 1;
        }
        else{
            return 0;
        }
    }


    public static int check(String expression){
        Stack stack = new Stack(expression.length());
        char tmp;
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c== '{' || c=='[' ||c=='('){
                stack.push(c);
            }
            if( c== '}' || c ==']' || c==')'){
                if(stack.isEmpty() == 1){
                    System.out.println("Right Parentheses are more than left");
                    return 0;
                }
                else{
                    tmp = stack.pop();
                    if(match(tmp,c) != 1){
                        System.out.println("Mismatched Parentheses");
                        return 0;
                    }
                }

            }

        }
        if(stack.isEmpty() == 1){
            System.out.println("Balanced Parentheses");
            return 1;
        }
        else{
            System.out.println("Left Parentheses are more than right");
            return 0;
        }
    }
}
