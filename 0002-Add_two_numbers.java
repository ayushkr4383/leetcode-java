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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode l3 = null;
       
        l3 = null;
        ListNode ptr3 = l3;
        int carry = 0;
        int sum=0, digit=0;
        while(ptr1!=null || ptr2!=null){
            int digit1 = 0, digit2 = 0;
            if(ptr1!=null){
                digit1 = ptr1.val;
        }
            if(ptr2!=null){
                digit2 = ptr2.val;
            }
            sum = digit1+digit2+carry;
            
            digit = sum%10;
            if(ptr1!=null){
                ptr1 = ptr1.next;
            }
            if(ptr2!=null){
                ptr2= ptr2.next;
            }
            
            
            
            if(sum>=10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            ListNode newnode = new ListNode();
            if(l3==null){
                newnode.val = digit;
                l3 = newnode;
                ptr3 = newnode;

            }
            else{
                newnode.val = digit;
                ptr3.next = newnode;
                ptr3 = ptr3.next;
            }
            sum = 0;

        }
        if(carry==1){
            ListNode newnode = new ListNode();
            newnode.val = 1;
            ptr3.next = newnode;
            ptr3 = ptr3.next;
        }
        return l3;
    }
}