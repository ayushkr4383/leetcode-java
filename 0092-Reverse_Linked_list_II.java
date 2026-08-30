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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur = head;
        ListNode next = head;
        ListNode prev = null;
        ListNode end = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeleft=dummy;
        int n=1;
        if(head==null || head.next==null){
            return head;
        }
        while(n!=right){
            end = end.next;
            n++;
        }
        int i=1;
        while(i!=left){
            beforeleft = cur;
            cur = cur.next;
            next = cur;
            i++;
        }
        ListNode savedll = cur;
        while(prev!=end){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur =next;
        }
        beforeleft.next = prev;
        savedll.next = cur;
        
        

    return dummy.next;
        
    }
}