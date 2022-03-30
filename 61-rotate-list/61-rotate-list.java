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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null)
            return null;
        
        if(k == 0)
            return head;
        
        ListNode current = head, newhead = null;
        int count = 1;
        
        while(current.next != null) {
            current = current.next;
            count++;
        }
        
        current.next = head;
        current = head;
        
        for(int i = 0; i < (count - k % count)- 1; i++) {
            current = current.next;
        }
        newhead = current.next;
        current.next = null;
        
        return newhead;
    }
}

