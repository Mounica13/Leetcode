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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)
            return head;
        
        ListNode current = head, start = null, end = null, prev = null, prestart = null, ahead = null;
        int count = 1;
        
        while(count != left) {
            prev = current;
            current = current.next;
            count++;
        }
        
        start = current;
        prestart = prev;
        prev = current;
        current = current.next;
        
        
        while(count != right) {
            ahead = current.next;
            current.next  = prev;
            prev = current;
            current = ahead;
            count++;
        }
        
        end = prev;
        if(prestart != null)
           prestart.next = end;
        else
            head = end;
        start.next = current;
        
        return head;
    }
}