class Solution {
    public int balancedStringSplit(String s) {
        int count1 = 0, count2 = 0, result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                count1++;
            }
            
            else{
                count2++;
            }
            
            if(count1 == count2){
                result++;
                count1 = count2 = 0;
            }
        }
        
        return result;
    }
}


//Time complexity  : O(n)
//Space complexity : O(1)