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
        public LinkedList splitAlternate(){
            LinkedList l2 = new LinkedList();
            Node p1 = this.head,p2 = null;
            l2.head = p2;
            while(p1 != null && p1.next != null){
                Node q = new Node();
                if(p2 !=null){
                    p2.next = p1.next;
                    p2 = p2.next;
                }
                else{
                    l2.head = p1.next;
                    p2 = l2.head;
                }
                p1.next = p1.next.next;
                p1 = p1.next;
            }
            return l2;
        }
        
    

        
}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        LinkedList l2 = new LinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.insert(5);
        linkedlist.insert(6);
        l2 = linkedlist.splitAlternate();
        l2.print();
    }
}
