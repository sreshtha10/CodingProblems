import java.util.*;

class Queue{
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    public void dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            return;
        }
        if(!s2.isEmpty()){
            s2.pop();
            return;
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s2.pop();
            return;
        }
        
    }
    public void enqueue(int x){
        s1.push(x);
    }
    public int peeks(){
      if(s2.isEmpty()){
          while(!s1.isEmpty()){
              s2.push(s1.pop());
          }
          return s2.peek();
      }
      else{
          return s2.peek();
      }
        
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int t = sc.nextInt();
        while(t!=0){
            int opt = sc.nextInt();
            int val;
            switch(opt){
                case 1: 
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println(q.peeks());
                    break;
            }
            t--;
        }
        sc.close();
        
    }
}
