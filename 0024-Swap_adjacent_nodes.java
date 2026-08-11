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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode ptr = head;
        ListNode curr = head;
        ListNode prev = null;
        if(head==null || head.next==null){
            return head;
        }
        temp = temp.next;
        curr = temp.next;
        
        temp.next = ptr;
        ptr.next = curr;
        head = temp;
        while(curr!=null && curr.next!=null){
            prev = ptr;
            ptr = curr;
            temp = ptr.next;
            curr = temp.next;
            temp.next = ptr;
            ptr.next = curr;
            prev.next = temp;
           
            
        }
        return head;

    }
}