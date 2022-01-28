class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> ((b[0]* b[0] + b[1]*b[1]) - (a[0]*a[0]+ a[1] * a[1])));
        
          for(int[] i : points) {
                queue.add(i);
                if(queue.size() > k){
                    queue.poll();
                }
          }
                                                         
         int[][] result = new int[queue.size()][2];
         int i = 0;
                                                         
         while(!queue.isEmpty()){
            result[i++] = queue.poll();
          
         }
         return result;
    }
}