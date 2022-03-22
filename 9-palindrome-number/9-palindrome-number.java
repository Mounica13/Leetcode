    // For number 1221, if we do 1221 % 10, we get the last digit 1, to get the second to the last digit, we need to remove the last digit from 1221, we could do so by dividing it by 10, 1221 / 10 = 122. Then we can get the last digit again by doing a modulus by 10, 122 % 10 = 2, and if we multiply the last digit by 10 and add the second last digit, 1 * 10 + 2 = 12, it gives us the reverted number we want. 

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        if(x % 10 == 0 && x != 0)
            return false;
        
        int remainder = 0,reversed_x = 0;
        int num = x;
        
  
        
        while(num > reversed_x)
        {
            remainder = num%10;
            reversed_x = (reversed_x*10) + remainder;
            num = num/10;
        }
        
        return num==reversed_x || num == reversed_x / 10;
    }
}


  //Time complexity : O(log10 (n))
  //Space complexity : O(1)