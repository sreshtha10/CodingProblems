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
        public void findMiddle(){
            Node fast = start;
            Node slow = start;
            while(fast != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.data);
            return;
        }
        


        
}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.insert(5);
        linkedlist.findMiddle();
        linkedlist.print();
    }
}
