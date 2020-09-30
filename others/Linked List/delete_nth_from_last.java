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
        //Basic Idea:
        //first travel to the nth node through only p1 and then stop.
        //Now traverse using both p1 and p2 until p1 reaches last node.
        //When p1 reaches last node p2 will be at the nth node from last.
        public void deleteNth_fromLast(int x){
            Node p1 = this.head,p2 = this.head;
            if(this.head == null)
                return;
            int count = 1;
            while(p1 != null && count <= x){
                p1 = p1.next;
                count ++;
            }
            if(p1 == null){
                head = head.next;
                return;
            }
            while(p1.next.next!=null){
                p1 = p1.next;
                p2 = p2.next;
            }
            p2.next = p2.next.next;
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
        linkedlist.insert(6);
        linkedlist.deleteNth_fromLast(6);
        linkedlist.print();
    }
}
