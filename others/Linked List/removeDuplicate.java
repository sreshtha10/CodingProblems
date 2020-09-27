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
    public  void removeDuplicate(){
        Node p = null,q = null;
        Node tmp;
        p = head;
        while(p.next != null){
            q = p;
            while(q.next != null){
                if(p.data == q.next.data){
                    tmp = q.next;
                    q.next = q.next.next;
                    System.gc();
                }
                else {
                    q = q.next;
                }
            }
            p = p.next;
        }
        return;

    }



}


public class random{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(2);
        linkedlist.insert(1);
        linkedlist.insert(4);
        linkedlist.removeDuplicate();
        linkedlist.print();
    }
}
