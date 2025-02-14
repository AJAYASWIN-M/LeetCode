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
    public ListNode removeElements(ListNode head, int val) {
        ListNode tptr=head,tptr1=tptr;
        while(tptr!=null){
            
            if(tptr.val==val && tptr==head){
                head=head.next;
                tptr = head;

            }
            else if(tptr.val==val){
                tptr1.next=tptr.next;
                tptr=tptr1.next;

            }else{
                tptr1=tptr;
                tptr=tptr.next;
            }
           
        }
        return head;
        
    }
}