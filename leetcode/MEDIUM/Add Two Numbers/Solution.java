class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        sum(l1,l2,l3,0);
        return l3;
    }
    public static void sum(ListNode l1,ListNode l2,ListNode l3,int c){
        
        if(l1 == null && l2 == null){
            l3.val  = c;
            return;
        }
        
        int tmp;
        
        if(l1 == null){
            tmp = c + l2.val;
            l2 = l2.next;
        }
        else if(l2 == null){
            tmp = c + l1.val;
            l1 = l1.next;
        }
        else{
            tmp = c +l1.val+l2.val;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        int carry = tmp/(int)10;
        int sum = tmp - (carry*10);
        l3.val = sum;
        if(l1 == null && l2 == null && carry == 0) return;
        ListNode p = new ListNode();
        l3.next = p;
        //System.out.println(carry+" "+sum);
        sum(l1,l2,p,carry);
    }
    
}
