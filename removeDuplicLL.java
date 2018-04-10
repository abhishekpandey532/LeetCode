/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode curr=head;
        ListNode nex=curr.next;
        //
        
        if(nex==null)
          return head;
        
        
        while(nex!=null){
            System.out.println(curr.val);
            
            if(nex.val==curr.val)
                nex=nex.next;
            else if(nex.val!=curr.val){
                curr.next=nex;
                curr=nex;
                nex=nex.next;
            }
        }
        curr.next=nex;
        return head;
        
    }
}