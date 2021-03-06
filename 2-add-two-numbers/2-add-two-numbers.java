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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        int carry = 0, sum = 0;
        ListNode l3 = new ListNode();
        ListNode current = l3;
        
        while(l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            sum = carry + x + y;
            carry = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum);
            current = current.next;
            
            if(l1 != null)
                l1 = l1.next;
            
            if(l2 != null)
                l2 = l2.next;
        }
        
        if(carry > 0)
            current.next = new ListNode(carry);
        
        return l3.next;
    }
}