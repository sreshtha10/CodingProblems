class LinkedList{
    class Node{
        int data;
        Node next;
    }
        Node head;
        int length = 0;
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
            length++;
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
            length++;
            
        }
        public void move(int item,int n){
            if(n > this.length){
                System.out.println("Out of bounds");
                return;
            }
            int r;
            Node p = head;
            Node tmp;
            int counter = 0;
            while(p.next != null){
                if(counter+n >= this.length){
                    System.out.println("Out of bounds");
                    return;
                }
                if(item == p.data){
                    tmp = p;
                    while(counter != n+1){
                        r = tmp.data;
                        tmp.data = tmp.next.data;
                        tmp.next.data = r;
                        counter++;
                        tmp = tmp.next;
                    }
                    return;
                }
                counter++;
                p = p.next;
            }
            if(p.data == item){
                System.out.println("It cannot be moved by "+n+" places");
                return;
            }
            System.out.println("Element not found");
            return;
        }

}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.insertStart(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.insert(0);
        linkedlist.move(4,2);
        linkedlist.print();
        
    }
}
