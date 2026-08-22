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
        if(head==null|| head.next==null){
            return head;
        }
        while(head!=null && head.next!=null && head.val==head.next.val){
            int duplicate = head.val;
            while(head!=null && head.val==duplicate){
                head = head.next;
            }
        }
        if(head==null){
            return null;
        }
        ListNode ptr1= head;
        ListNode ptr2 = head.next;
        while(ptr2!=null){
            if(ptr2.next!=null && ptr2.val==ptr2.next.val){
                int duplicate = ptr2.val;
                while(ptr2!=null && ptr2.val==duplicate){
                    ptr2 = ptr2.next;
                }
                ptr1.next=ptr2;
            }
            
            else{
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        return head;
    }
}