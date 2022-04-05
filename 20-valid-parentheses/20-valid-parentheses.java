class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 != 0)
            return false;
        
        Stack<Character> stack = new Stack<>();
        char[] p = s.toCharArray();
        
           for(char symbol : p){
            
            if(symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            }
            
            else if(symbol == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            
            else if(symbol == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            
             else if(symbol == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
              
             else
                  return false;
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
    }
}

//Time complexity : O(n)
//Space complexity : O(n)