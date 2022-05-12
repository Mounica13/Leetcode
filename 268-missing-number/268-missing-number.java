class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        if(nums[0] != 0)
            return 0;
        if(nums[nums.length - 1] != nums.length)
            return nums.length;
        for(int i = 0; i < nums.length - 1; i++){
            int expectedValue = nums[i] + 1;
            if(nums[i + 1] != expectedValue){ 
               return expectedValue;
            }  
            
        }
        return -1;
    }
}
//Time complexity : O(n log n)
//Space complexity : O(n)

