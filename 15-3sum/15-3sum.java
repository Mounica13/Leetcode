class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> result= new ArrayList<>();
        if(nums.length < 3 || (nums == null))
            return result;

        Arrays.sort(nums);
        int j = 0, k = 0, pivot = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i - 1] == nums[i])
                continue;
            j = i + 1;
            k = nums.length - 1;
            while(j  < k ){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    
                    while (j < k && nums[j] == nums[j - 1])
                     j++;
                    
                }
                else if(sum > 0){
                    k--;
                }
                else
                    j++;
            }
            
        }
        return result;
    }
}
           
              
         