class Solution {
    
    private HashMap<Character, String> setMap(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        return map;
    }
    
    private void Helper(String digits, StringBuilder sb, HashMap<Character, String> map, int index, List<String> result){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(char ch : letters.toCharArray()){
            sb.append(ch);
            Helper(digits, sb, map, index + 1, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if(digits.length() == 0)
            return result;
        
        HashMap<Character, String> map = new HashMap<>();
        map = setMap();
        StringBuilder sb = new StringBuilder();
        Helper(digits, sb, map, 0, result);
        
        return result;
    } 
}


//Time complexity : O(N. 4^N) //N is the length of digits
//Space complexity : O(N) //for stack recursion in backtracking