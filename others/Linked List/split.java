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
        public LinkedList split(int x,LinkedList l2){
            Node p1 = this.head;
            while(p1.next != null){
                if(p1.next.data == x){
                    l2.head = p1.next;
                    Node tmp = p1.next.next;
                    while(tmp != null){
                            Node q =new Node();
                            q.data = tmp.data;
                            q.next = tmp.next;
                            tmp = tmp.next;
                    }
                    p1.next = null;
                    return l2;
                }
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
        l2 = linkedlist.split(3,l2);
        linkedlist.print();
    }
}
