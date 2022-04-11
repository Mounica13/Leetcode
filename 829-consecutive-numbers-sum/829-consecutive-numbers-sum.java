class Solution {
    public int consecutiveNumbersSum(int n) {
        
        int result = 0, index = 1;
        while(n > 0) {
            n = n - index;
            if(n % index == 0) {
                result++;
            }
            index++;
        }
        return result;
    }
}



    
//Time complexity : O((SQRT)n)
//Space complexity :O(1)
