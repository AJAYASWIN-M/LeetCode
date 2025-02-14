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
    public boolean isPalindrome(ListNode head) {
        ListNode tptr=head,start=null;
        while(tptr!=null)
        {
            ListNode newnode = new ListNode(tptr.val);
            newnode.next=start;
            start=newnode;
            tptr=tptr.next;
        }
        ListNode tptr1=head,tptr2=start;
        while(tptr1!=null && tptr2!=null)
        {
            if(tptr1.val!=tptr2.val)
            {
                return false;
            }
            tptr1=tptr1.next;
            tptr2=tptr2.next;
        }
        return true;     
    }
}