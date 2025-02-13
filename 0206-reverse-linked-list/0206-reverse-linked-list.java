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
    public  ListNode reverseList(ListNode head) {
        ListNode ptr1=head;
        ListNode ptr2 =null;
        ListNode ptr3 =null;
        while(ptr1!=null){
            ptr3=ptr2;
            ptr2=ptr1;
            ptr1=ptr1.next;
            ptr2.next=ptr3;
        }
        head= ptr2;
        return head;

        
    }
}