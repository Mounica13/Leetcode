class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0, i = 0;
        
        while(i < s.length()) {
            int count0 = 0, count1 = 0;
            
            if(s.charAt(i) == '0'){
                while(i < s.length() && s.charAt(i) == '0') {
                    count0++;
                    i++;
                }
                
                int j = i; 
                while(j < s.length() && s.charAt(j) == '1') {
                    count1++;
                    j++;
                }
            
            }
            else {
               while(i < s.length() && s.charAt(i) == '1') {
                    count1++;
                    i++;
               }
                
                int j = i; 
                while(j < s.length() && s.charAt(j) == '0') {
                    count0++;
                    j++;
                }   
            }
            
            result = result + Math.min(count0, count1);
        
    }
            
        return result;    
        
    }
}