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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode l3 = null;
        ListNode prev = null;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val ){
                ListNode tmp = new ListNode(l1.val);
                if(l3 == null){
                    l3 = tmp;
                    prev = tmp;
                }
                else{
                    prev.next = tmp;
                    prev = tmp;
                }
                
                l1 = l1.next;
            }
            else{
                ListNode tmp = new ListNode(l2.val);
                if(l3 == null){
                    l3 = tmp;
                    prev = tmp;
                }
                else{
                    prev.next = tmp;
                    prev = tmp;
                }
                l2 = l2.next;
            }
        }
        
        while(l1 != null){
            ListNode tmp = new ListNode(l1.val);
                if(l3 == null){
                    l3 = tmp;
                    prev = tmp;
                }
                else{
                    prev.next = tmp;
                    prev = tmp;
                }
            l1 = l1.next;
        }
        
        while(l2 != null){
            ListNode tmp = new ListNode(l2.val);
                if(l3 == null){
                    l3 = tmp;
                    prev = tmp;
                }
                else{
                    prev.next = tmp;
                    prev = tmp;
                }
            l2 = l2.next;
        }
        
        
        return l3;
        
    }
}
