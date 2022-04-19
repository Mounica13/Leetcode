class Solution {
    public String addStrings(String num1, String num2) {
       
        int idx1 = num1.length() - 1, idx2 = num2.length() - 1;
        int carry = 0, result = 0;
        String str = "";
        
        while(idx1 >= 0 || idx2 >= 0) {
              int x1 = (idx1 >= 0) ? num1.charAt(idx1) - '0' : 0;
              int x2 = (idx2 >= 0) ? num2.charAt(idx2) - '0' : 0;
              result = (x1 + x2 + carry) % 10;
              carry = (x1 + x2 + carry) / 10;
              str = result + str;
              idx1--;
              idx2--;
        }
        
        if(carry != 0){
            str = carry + str;
        }
        
        return str;
    }
    
}

//Time complexity : O(Max(N1, N2)) //N1 - length of first string, N2 - length of second string
//Space complexity : O(Max(N1, N2)) //Length of the new string is the max(N1, N2) + 1(carry).      