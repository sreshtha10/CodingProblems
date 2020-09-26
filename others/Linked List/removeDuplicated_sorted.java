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
        public void removeDuplicate_sorted(){
            Node p = head;
            if(head == null){
                return;
            }
            while(p.next != null){
                    while(p.data == p.next.data){
                        p.next = p.next.next;
                        if(p.next == null){
                            return;
                        }
                    }
                p = p.next;
            }
            return;
        }
}

public class Main{
    public static void main(String args[]){
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(1);
        l.insert(2);
        l.insert(2);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(6);
        l.removeDuplicate_sorted();
        l.print();
    }
}
