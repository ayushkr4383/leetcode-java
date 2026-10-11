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
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return head;
        ListNode temp = head.next;
        
        while(temp!=null){
            ListNode nextnode = temp.next;
            ListNode prev = head;
            ListNode ptr = null;
            ListNode curr = temp;
            while(prev!=temp && curr.val>prev.val){
                ptr = prev;
                prev = prev.next;
            }
            if(prev!=temp){
                    ListNode p = head;
                    while(p.next!=curr){
                        p = p.next;
                    }
                    p.next = curr.next;
                
                if(ptr==null){
                    curr.next = head;
                    head=curr;
                }
                else{
                    curr.next = prev;
                    ptr.next = curr;
                }
            }
            temp = nextnode;
        }
        return head;
    }
}