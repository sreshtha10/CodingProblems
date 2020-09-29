class Node{
    int data;
    Node next;
}
class LinkedList{
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
        public void deleteAlternate(){
            Node p;
            if(this.head == null || this.head.next == null){
                return;
            }
            p = this.head;
            while(p!=null){
                if(p.next != null && p.next.next != null)
                    p.next = p.next.next;
                else{
                    p.next = null;
                    return;
                }
                p = p.next;
            }
            
     
            
        }
}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.insert(6);
        linkedlist.insert(5);
        linkedlist.insert(7);
        linkedlist.insert(8);
        linkedlist.deleteAlternate();
        linkedlist.print();
        
    }
}
