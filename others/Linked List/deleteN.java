
class LinkedList{
    class Node{
        int data;
        Node next;
    }
        Node head;
        public void insert(int data){
            Node p = new Node();
            p.data = data;
            p.next = null;
            if(head == null){
                head = p;
            }
            else{
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = p;
            }
        }
        
        public void print(){
            Node p = head;
            if(head == null){
                System.out.println("List is empty");
            }
            while(p!= null){
                System.out.println(p.data+" ");
                p = p.next;
            }
        }
        public void insertStart(int data){
            Node p = new Node();
            p.data= data;
            p.next = head;
            head = p;
            
        }
        public void delete(int n){
            Node tmp,p;
            p = head;
            if(head.data == n){
                head = head.next;
            }
            while(p.next != null){
                if(p.next.data ==n ){
                    p.next = p.next.next;
                }
                p = p.next;
            }
            return;
        }

        
}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.insertStart(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(2);
        linkedlist.insert(0);
        linkedlist.print();
        System.out.println();
        linkedlist.delete(2);
        linkedlist.print();
    }
}
