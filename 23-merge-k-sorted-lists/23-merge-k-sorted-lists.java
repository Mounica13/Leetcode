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
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists == null)
          return null;
        
        PriorityQueue<ListNode> queue =  new PriorityQueue<>((a,b) -> a.val- b.val);
        
        for(ListNode point : lists){
            if(point != null) {
                queue.offer(point);
            }
        }
        
        
        ListNode head = new ListNode();
        ListNode current = head;
        
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            current.next = node;
            current = current.next;
            if(current.next != null){
                queue.offer(current.next);
            }
        }
        
        return head.next;
    }
}