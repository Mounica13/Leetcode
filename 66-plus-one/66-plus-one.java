class Solution {
    public int[] plusOne(int[] digits) {
        
      /*  long largeInteger = digits[0];
       
        for(int i = 1; i < digits.length; i++)
        {
            largeInteger = largeInteger * 10 + digits[i];
        }
        largeInteger++;
         
        String temp = Long.toString(largeInteger);
        int[] new_digits = new int[temp.length()];
        
        for(int i = 0; i < temp.length(); i++)
        {
           // new_digits[i] = Integer.parseInt(temp.charAt(i) + "");
             new_digits[i] = temp.charAt(i) - '0';
        }
        
        return new_digits; */
        
      
        for(int i = digits.length - 1; i >= 0; i --)
        {
            digits[i] =  digits[i] + 1;
            if(digits[i] <= 9)
                return digits;
            else
                digits[i] = 0;
        }
        
        int[] newdigits = new int[digits.length + 1];
        newdigits[0] = 1;
        
        return newdigits;
    }
}