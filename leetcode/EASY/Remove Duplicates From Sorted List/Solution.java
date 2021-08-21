/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head,tmp;
        
        if(p == null || p.next == null){
            return head;
        }
        
        while(p.next != null){
            if(p.val == p.next.val){
                //delete p.next
                tmp = p.next;
                p.next = p.next.next;
                tmp = null;
                continue;
            }
            p = p.next;
        }
        
        
        return head;
    }
}
