class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0, index = 0;
        
        for(int i = 0; i < nums.length; i++){
            index = map.getOrDefault(nums[i], 0);
            count = count + index;
            map.put(nums[i], index+ 1);
        }
        
        return count;
    }
}