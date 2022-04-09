class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
       int n = heights.length, bricksUsed = 0, diff = 0;
        
       for(int i = 1; i < n; i++){
           diff = heights[i] - heights[i - 1];
           if(diff > 0){
               maxHeap.add(diff);
               if(maxHeap.size() > ladders) {
                   bricksUsed = bricksUsed +  maxHeap.remove();
               }
               if(bricksUsed > bricks) {
                   return i - 1;
               }
           }
       }
        return n - 1;
  }
}

//Time compklexity : O(N log K)
//Space complexity: O(K)