class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int point= 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
            
           if(map.containsKey(ch)){
               point = Math.max(point, map.get(ch));
           }
            
          maxLength = Math.max(maxLength, i - point + 1);
          map.put(ch, i + 1);
        }
            
        return maxLength;
    }
}