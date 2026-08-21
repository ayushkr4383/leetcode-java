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
    public ListNode rotateRight(ListNode head, int k) {
        int n=1;
        int i=1, j=1;
        int rotations = 0;
        ListNode temp = head;
        ListNode ptr2 = head;
        ListNode ptr1=head;
        if(head==null){
            return head;
        }
        while(temp.next!=null){
            temp = temp.next;
            n++;
        }
        
        rotations = k%n;
        if(rotations==0){
            return head;
        }
        int real  = n-rotations;
        while(i<real){
            ptr1 = ptr1.next;
            i++;
        }
        if(ptr1.next!=null){
            ptr2 = ptr1.next;
        }
        temp.next = head;
        head = ptr2;
        ptr1.next = null;

        return head;
    }
    
}