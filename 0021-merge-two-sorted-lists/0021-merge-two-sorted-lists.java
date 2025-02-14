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
        if(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else
            {
                list2.next=mergeTwoLists(list2.next,list1);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    //     ListNode newnode2 = null,end=null;
    //     ListNode tptr1=list1;
    //     ListNode tptr2=list2;
    //     if(list1==null){
    //         return list2;
    //     }
    //     if(list2==null){
    //         return list2;
    //     }
    //     while(tptr1!=null && tptr2!=null){
    //         if(tptr1.val<tptr2.val){
    //             ListNode newnode = new ListNode(tptr1.val,null);
    //             tptr1=tptr1.next;
    //             if(newnode2==null){
            
    //             }
                
    //             newnode.next=null;
    //         }
    //         else if(tptr2.val<tptr1.val){
    //             newnode.val=tptr2.val;
    //             tptr2=tptr2.next;
    //             newnode.next=null;
    //         }
    //         if(start==null){
    //             start=end=newnode;
    //         }
    //         else{
    //             end.next=newnode;
    //             end=newnode;
    //         }
           
    //     }
    //     if(tptr1!=null){
    //         return tptr2;
    //     }
    //     else{
    //         return tptr1;
    //     }
        
    // }
    }
}