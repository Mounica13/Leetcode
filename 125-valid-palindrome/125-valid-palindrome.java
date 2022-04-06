class Solution {
    public boolean isPalindrome(String s) {
       
        if(s == "")
            return true;
        
        char[] word = new char[s.length()];
        int index = 0;
        
         for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)) {
                word[index++] = ch;
            }
         }
        String realword = String.valueOf(word);
        
        index = 0;
        for(int j = s.length() - 1; j > 0; j--) {
            char ch = Character.toLowerCase(s.charAt(j));
            if(Character.isLetterOrDigit(ch)) {
                word[index++] = ch;
            }
        }
        String reverse = String.valueOf(word);
        
        if(realword.equals(reverse))
            return true;
        else
            return false;
        
    }
}


//Time complexity : O(n)
//Space complexity : O(1)