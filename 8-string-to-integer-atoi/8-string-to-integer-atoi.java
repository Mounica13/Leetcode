class Solution {
    public int myAtoi(String s) {
        int result = 0, index = 0, sign = 1;
        int n = s.length();
        
        while(index < n && s.charAt(index) == ' ') {
            index++;
        } 
        
       if(index < n && s.charAt(index) == '+') {
            sign = 1;
            index++;
        }
        else if(index < n  && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        
        
        while(index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            if ((result > Integer.MAX_VALUE / 10 ) || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                if(sign == -1) 
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
               
              result = result * 10 + digit;
              index++;
        }
        
        result = sign * result;
        return result;
    }
}