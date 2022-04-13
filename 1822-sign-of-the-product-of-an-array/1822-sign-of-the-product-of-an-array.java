class Solution {
    
   /* private int signFunc(int[] nums1) {
        int product = 1;
        for(int i : nums1) {
            product *= i;
        }
        return product;
    }
    public int arraySign(int[] nums) {
        int[] nums1 = new int[nums.length];
        for(int i = 0 ; i  < nums.length; i++) {
            if(nums[i]  <  0) {
                nums1[i] = -1;
            }
             else if(nums[i]  > 0) {
                nums1[i] = 1;
            }
            else {
                nums1[i] = 0;
            }
        }
        
        return signFunc(nums1);
    } */

    
   
    
  //Solution 2:
    public int arraySign(int[] nums) {
        
        Boolean sign = true;
        for(int i = 0; i < nums.length; i++) {
           if(nums[i] == 0)
               return 0;
           
           if(nums[i] < 0)
               sign = !sign;
        }
        
        return (sign) ? 1 : -1;
    }
    
}