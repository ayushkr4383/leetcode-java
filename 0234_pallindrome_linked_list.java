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
 import java.util.Stack;
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
       
        ListNode temp = head;
        ListNode ptr = head;
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        int top = st.peek();
        while(ptr!=null){
            if(ptr.val==top){
                ptr = ptr.next;
                st.pop();
                if(st.isEmpty()==false){
                    top = st.peek();
                }
                

            }
            else{
                return false;
            }
        }
        return true;
    }
}