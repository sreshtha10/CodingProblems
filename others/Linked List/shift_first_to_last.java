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
        public void shift_first_to_last(){
            Node tmp= head ,p = head;
            if(head.next != null){
                head = head.next;
            }
            else{
                return;
            }
            while(p.next != null){
                p = p.next;
            }
            p.next = tmp;
            tmp.next = null;
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
        linkedlist.shift_first_to_last();
        linkedlist.print();
    }
}
