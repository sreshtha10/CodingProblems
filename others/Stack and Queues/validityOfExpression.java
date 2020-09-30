// checking the validity of an expression using stack.
class Stack{
    int size;
    int[] arr;
    Stack(int size){
        this.size = size;
        this.arr = new int[size];
    }
    int top = -1;
    int length = 0;
    public void push(int x){
        if(this.length == size-1){
            return; //Stack Overflow.
        }
        top += 1;
        this.length++;
        this.arr[this.top]  = x;
        return;
    }
    public int pop(){
        if(this.length == 0){
            System.exit(1); // Stack Underflow.
        }
        int x = this.arr[this.top];
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
}
public class Main{
    public static void main(String args[]){
        Stack stack = new Stack(4);
        
    }
}
