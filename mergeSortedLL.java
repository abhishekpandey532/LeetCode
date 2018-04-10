/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
        ListNode nhead;
        ListNode curr1,curr2;
        ListNode th;
        
        curr1=l1;
        curr2=l2;
            
        if(l1.val<=l2.val){
            nhead=l1;
            th=nhead;
            curr1=curr1.next;
        }
        else{
            nhead=l2;
            th=nhead;
            curr2=curr2.next;
        }
        
        while(true){
            if(curr1==null || curr2==null)
                break;
            
            if(curr1.val<=curr2.val){
                th.next=curr1;
                curr1=curr1.next;
                th=th.next;
            }
            else{
                th.next=curr2;
                curr2=curr2.next;
                th=th.next;
            }
        }
        
        if(curr1==null){
            th.next=curr2;
        }
        else{
            th.next=curr1;
        }
        
        return nhead;
        
        
    }
}