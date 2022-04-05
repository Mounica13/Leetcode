class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int temp = 0, i = 0, result = 0;
        
        if(nums.length == 0 || k == 0)
            return result;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        
        for(i = k; i < nums.length; i++) {
            temp = queue.peek();
            if(nums[i] > temp) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        
        if(!queue.isEmpty()){
            return queue.peek();
        }
        
        return result;
    }
}