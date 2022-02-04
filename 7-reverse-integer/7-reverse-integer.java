class Solution {
    public int reverse(int x) {
        
        int i,digit = 0;
        long result = 0;
        while(x != 0) {
            digit = x % 10;
            x = x / 10; 
            result = result * 10 + digit;
            
        }
        
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            return 0;
       
        return (int)result;
    }
}