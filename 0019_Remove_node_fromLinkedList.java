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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        int index=0;
        int j=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp =temp.next;
        }
        index = (count-n)+1;
        ListNode ptr = head;
        ListNode ptr1 = head;
        while(ptr!=null){
            if(count==1){
                head = null;
                return head;
            }
            if(count==n){
                head = head.next;
                return head;
            }
            j++;
            if(j==index){
                ptr1.next = ptr1.next.next;
            }
            ptr1 = ptr;
            ptr = ptr.next;
        }
        return head;
        
    }
}