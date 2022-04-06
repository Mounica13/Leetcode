/* class Solution {
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
} */


//Time complexity : O(n)
//Space complexity : O(n)


class Solution {
    public boolean isPalindrome(String s) {
        if(s == "")
            return true;
        
        for(int i = 0, j = s.length() -1; i < j; i++, j--){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            
            if(Character.toLowerCase(s.charAt(i)) != (Character.toLowerCase(s.charAt(j))))
              return false;
        }
        return true;
        
    }
}



//Time complexity : O(n)
//Space complexity :O(1)