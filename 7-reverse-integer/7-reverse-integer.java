class Solution {
    public int reverse(int x) {
        
      int remainder = 0, result = 0; //long should not be used as described in the question
    
        while(x != 0) {
          remainder = x % 10;
          x = x / 10;
         
          if(result > Integer.MAX_VALUE/ 10 || result == Integer.MAX_VALUE / 10 && remainder > 7)
            return 0;
          if(result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && remainder < -8)
            return 0;
         
          result = (result * 10) + remainder;
      }
        
        
        
        return result;
    }
}