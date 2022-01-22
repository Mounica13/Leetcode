class Solution {
    public int removeElement(int[] nums, int val) {
        
        int end = nums.length - 1, start = 0;
        while(end >= start)
        {
            if(nums[start] == val)
            {
                nums[start] = nums[end];
                end--;
            } 
            
            else
                start++;
        }
         return end + 1;
    }
}