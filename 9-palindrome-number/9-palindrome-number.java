class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        
        int remainder = 0,reversed_x = 0;
        int num = x;
        
        while(num!=0)
        {
            remainder = num%10;
            reversed_x = (reversed_x*10) + remainder;
            num = num/10;
        }
        
        return x==reversed_x;
    }
}