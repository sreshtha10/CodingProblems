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
    public boolean search(int x){
        Node p = head;
        while(p!=null){
            if(x == p.data) {
                return true;
            }
            p = p.next;
        }
        return false;
    }
    public LinkedList union(LinkedList l2){
        LinkedList r = new LinkedList();
        Node p = this.head;
        Node q = l2.head;
        r = this;
        while(q!= null){
            if(!r.search(q.data)){
                r.insert(q.data);
            }
            q = q.next;
        }
        return r;
    }


}


public class random{
    public static void main(String args[]){
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(4);
        l2.insert(4);
        l2.insert(5);
        l2.insert(2);
        LinkedList l3 = l1.union(l2);
        l3.print();

    }
}
