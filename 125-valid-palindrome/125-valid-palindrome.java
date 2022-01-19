class Solution {
    public boolean isPalindrome(String s) {
        
        if(s == " ")
            return true;
        
         char[] arr = new char[s.length()];
        int index = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch))
                arr[index++] = ch;
        }
        String realword = String.copyValueOf(arr);
        
        index = 0;
        for(int i = s.length() - 1; i >= 0; i--)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch))
                arr[index++] = ch;
        }
        String reverse = String.copyValueOf(arr);
        
        if(realword.equals(reverse))
            return true;
        else
            return false;
        
    }
}