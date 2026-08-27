/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.HashMap;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        while(ptr1!=null){
            map.put(ptr1, ptr1.val);
            ptr1 = ptr1.next;
        }
        ListNode answer = null;
        while(ptr2!=null){
            if(map.containsKey(ptr2)){
                answer = ptr2;
                break;
            }
            else{
                ptr2 = ptr2.next;
            }
        }
        return answer;

        
    }
}