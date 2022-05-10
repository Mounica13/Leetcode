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
    
    private void Helper(String digits, StringBuilder sb, HashMap<Character, String> map, List<String> result, int index){
        if(digits.length() == index){
            result.add(sb.toString());
            return;
        }
        
        String letters = map.get(digits.charAt(index));
        for(char ch : letters.toCharArray()){
            sb.append(ch);
            Helper(digits, sb, map, result, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
  
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        if(digits.length() == 0)
            return result;
        
        map = setMap();
        StringBuilder sb = new StringBuilder();
        Helper(digits, sb, map, result, 0);
        
        
        return result;
    }
}