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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;  
        
        ListNode tptr1 = head.next;
        ListNode tptr2 = head;

        while (tptr1 != null) {  
            if (tptr2.val == tptr1.val) {
                tptr2.next = tptr1.next;  
            } else {
                tptr2 = tptr1;  
            }
            tptr1 = tptr1.next;  
        }
        
        return head;
    }
}
