class Solution {
    private final int[] values= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < values.length && num > 0 ;i++) {
            
            while(values[i] <= num) {
                num = num - values[i];
                result.append(roman[i]);
            }
        }
        
        return result.toString();
    }
}

//Time complexity : O(1)
//Space complexity : O(1)

 