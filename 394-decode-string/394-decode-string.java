class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int k = 0;
        StringBuilder currentString = new StringBuilder();
        
        for(int i = 0 ; i  < s.length(); i++){
           char ch = s.charAt(i);
           if(Character.isDigit(ch)) {
               k = k * 10 + ch - '0';
           }
            
           else if(ch == '[') {
            countStack.push(k);
            stringStack.push(currentString);
            k = 0;
            currentString = new StringBuilder();
           }
            
           else if(ch == ']') {
               StringBuilder decodedString = stringStack.pop();
               for(int currentK = countStack.pop(); currentK > 0; currentK--) {
                   decodedString.append(currentString);
               }
               
               currentString = decodedString;
           }
           else {
               currentString.append(ch);
            }
        }
        
        return currentString.toString();
    }
}


//Time complexity : O(maxK. n)  where maxK is the maximum value of kkk and nnn is the length of a given string s. We traverse a string of size n and iterate k times to decode each pattern.


//Space complexity : O(m + n) where m is the number of letters(a-z) and n is the number of digits(0-9) in string s.
