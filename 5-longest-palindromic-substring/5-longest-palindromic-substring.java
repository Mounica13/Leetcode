class Solution {
    
    int result_length = 0, result_start = 0;
    
    private void findLongPalindrome(String s, int start, int end){
        int word_length = 0;
        
        while(start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        
        word_length = end - start - 1;
        
        if(result_length < word_length) {
            result_start = start + 1;
            result_length = word_length;
        }
    }
    public String longestPalindrome(String s) {
        
         if(s.length()  <  2){
            return s;
        }
        
        for(int i = 0; i < s.length() - 1; i++) {
            findLongPalindrome(s, i, i);
            findLongPalindrome(s, i, i + 1);
            
        }
        
        String result = s.substring(result_start, result_start + result_length);
        return result;
    }
}


//Time complexity :O(n * n)
//Space complexity : O(1)
        
        
    
