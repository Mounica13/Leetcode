class Solution {
    
    private void validateParanthesis(List<String> result, String s, int open, int close, int n) {
        if(s.length() == (2 * n)) {
            result.add(s);
            return;
        }
        
        if(open < n) {
            validateParanthesis(result, s + "(" , open + 1, close, n);
        }
        
        if(close < open){
            validateParanthesis(result, s + ")" , open , close + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        validateParanthesis(result, "", 0, 0, n);
        return result;
    }
}