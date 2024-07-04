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
    public ListNode reverseList(ListNode head) {
        
    Stack<Integer>st=new Stack<>();
        ListNode temp=head;
        //push the element in the stack
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        // make the last element of stack is head
        temp=head;
        // pop the element and make a new linklist 
        while(temp!=null){
            temp.val=st.pop();
            temp=temp.next;
        }
        
        return head;
        
        
        
    }
}