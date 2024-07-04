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
        // brute force
//     Stack<Integer>st=new Stack<>();
//         ListNode temp=head;
//         //push the element in the stack
//         while(temp!=null){
//             st.push(temp.val);
//             temp=temp.next;
//         }
//         // make the last element of stack is head
//         temp=head;
//         // pop the element and make a new linklist 
//         while(temp!=null){
//             temp.val=st.pop();
//             temp=temp.next;
//         }
        
//         return head;
        
        // optimal 1(using inplace replacement )
        
//         ListNode temp=head;
//         ListNode prev=null;
        
//         while(temp!=null){
//             // store the next element of temp
//             ListNode front=temp.next;
            
//             // make prev to be the current
//             temp.next=prev;
            
             
//             prev=temp;
//             // make temp to be next element
            
//             temp=front;
//         }
        
//        return prev; 
        
        
        // optimal 2
        
        
        ListNode newhead1=reverselinkedlist(head);
        return newhead1;
    }
    
    
    public ListNode reverselinkedlist(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        
         ListNode newhead2=reverselinkedlist(head.next);
        
        ListNode front=head.next;
        
        front.next=head;
        
        head.next=null;
        
        return newhead2;
    }
}