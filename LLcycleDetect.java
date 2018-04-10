/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow=head;
        
        if(slow==null || slow.next==null)
            return false;
        
        ListNode fast=slow.next.next;
        
        if(fast==null)
            return false;
        
        while(true){
            if(slow==null || fast==null)
                return false;
            
            if(slow==fast)
                return true;
            
            
            
            slow=slow.next;
            
            if(fast.next!=null)
            fast=fast.next.next;
            else
                return false;
        }
        
        //return false;
        
        
        
    }
}