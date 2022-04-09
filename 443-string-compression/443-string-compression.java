class Solution {
    
    
    public int compress(char[] chars) {
       int idx1 = 0, idx2 = 0, n;
       n = chars.length;
        
       while(idx1 < n) {
           int count = 0;
           char ch = chars[idx1];
           while(idx1 < n && chars[idx1] == ch) {
               idx1++;
               count++;
           }
           
          chars[idx2++] = ch;
          if(count != 1){
          //  String s = Integer.toString(count);
           // char[] countChars = s.toCharArray();
            for(char digit : Integer.toString(count).toCharArray()) {
                chars[idx2++] = digit;
            }
          }
           
       }
        
        return idx2;
    }
}

//Time complexity : O(n)
//Space complexity : O(n)