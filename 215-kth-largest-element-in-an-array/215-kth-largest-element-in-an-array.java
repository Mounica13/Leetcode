class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int result = -1;
        
        if(nums.length == 0 || k <= 0)
            return result;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < k; i++)
        {
            
              heap.add(nums[i]);
        }
        
     
        for(int i = k; i < nums.length; i++)
        {
            int temp = heap.peek();
            if(nums[i] > temp)
            {
                heap.poll();
                heap.add(nums[i]);
            }
        }
            
        
        
        if(!heap.isEmpty())
            return heap.peek();
        
        return result;
    }
}