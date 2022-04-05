class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            
            if(sum == k)
                count++;
            
            if(map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}