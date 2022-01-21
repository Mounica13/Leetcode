class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++)
        {
            minheap.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = minheap.poll();
            
        }
        return nums;
    }
}