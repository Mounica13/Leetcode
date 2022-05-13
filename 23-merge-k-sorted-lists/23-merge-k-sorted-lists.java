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
        
        PriorityQueue<Integer> queue =  new PriorityQueue<>((a,b) -> a - b);
        
        for(ListNode point : lists){
            while(point != null) {
                queue.offer(point.val);
                point = point.next;
            }
        }
        
        
        ListNode head = new ListNode();
        ListNode current = head;
        
        while(!queue.isEmpty()){
            Integer value = queue.poll();
            current.next = new ListNode(value);
            current = current.next;
        }
        
        return head.next;
    }
}