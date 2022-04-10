class Solution {
    public String breakPalindrome(String palindrome) {
        
        int length = palindrome.length();
        if(length == 1){
            return "";
        }
       
        char[] breakPalindrome = palindrome.toCharArray();
        for(int i = 0; i < length / 2; i++) {
            if(breakPalindrome[i] != 'a'){
                breakPalindrome[i] = 'a';
                return String.valueOf(breakPalindrome);
            }
        }
        
        breakPalindrome[length - 1] = 'b';
        return String.valueOf(breakPalindrome);
    }
}


  //Time complexity :O(n)
//Space complexity : O(1)