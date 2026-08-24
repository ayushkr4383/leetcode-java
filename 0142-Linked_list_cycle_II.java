/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast=head;
        ListNode ptr = head;
        int found = 0;
        int pos=0;
        if(head==null|| head.next==null){
            return null;
            
        }
        if(head.next==head){
            return head;
        }
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                found = 1;
                break;
            }
        }
        if(found==1){
            while(ptr!=slow){
                ptr = ptr.next;
                pos++;
                slow = slow.next;
            }
        }
        if(found==0){
            
            return null;
        }
        return ptr;
    }
}