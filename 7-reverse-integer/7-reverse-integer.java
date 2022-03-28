class Solution {
    public int reverse(int x) {
        
      int remainder = 0;
      long result = 0;
      while(x != 0) {
          remainder = x % 10;
          x = x / 10;
          result = (result * 10) + remainder;
      }
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        
        return (int)result;
    }
}