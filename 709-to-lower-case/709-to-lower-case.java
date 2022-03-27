class Solution {
    public String toLowerCase(String s) {
        
      char[] ch = new char[s.length()];
        
      for(int i = 0; i < s.length(); i++) {
        ch[i] = s.charAt(i);
        if(ch[i] >= 65 && ch[i] <= 90) {
            ch[i] = (char) ((int) ch[i] + 32);
          }
      }
       
        return String.valueOf(ch);
      
    }
}