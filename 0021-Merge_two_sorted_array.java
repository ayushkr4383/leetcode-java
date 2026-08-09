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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        list3 = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode ptr = list3;
        ListNode newnode = null;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                if(list3==null){
                    newnode = new ListNode(temp1.val);
                    list3 = newnode;
                    ptr = newnode;
                    temp1 = temp1.next;
                }
                else{
                    newnode = new ListNode(temp1.val);
                    ptr.next = newnode;
                    ptr = ptr.next;
                    temp1 = temp1.next;
                }
            }
            else{
                if(list3==null){
                    newnode = new ListNode(temp2.val);
                    list3 = newnode;
                    ptr = newnode;
                    temp2 = temp2.next;
                }
                else{
                    newnode = new ListNode(temp2.val);
                    ptr.next = newnode;
                    ptr = ptr.next;
                    temp2 = temp2.next;
                }
            
            }
           
        }
         while(temp1!=null){
                if(list3==null){
                    newnode= new ListNode(temp1.val);
                    list3 = newnode;
                    ptr = newnode;
        
                    temp1 = temp1.next;
                }
                else{
                    newnode = new ListNode(temp1.val);
                    ptr.next = newnode;
                    ptr = ptr.next;
                    temp1 = temp1.next;
                }
            }
            while(temp2!=null){
                if(list3==null){
                    newnode= new ListNode(temp2.val);
                    list3 = newnode;
                    ptr = newnode;
                    temp2 = temp2.next;
                }
                else{
                    newnode = new ListNode(temp2.val);
                    ptr.next = newnode;
                    ptr = ptr.next;
                    temp2 = temp2.next;
                }
            }
        return list3;
    }
}