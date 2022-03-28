class Solution {
    public int lengthOfLongestSubstring(String s) {
        int point = 0, max_length = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
               point= Math.max(point, map.get(ch)); 
            }
            max_length = Math.max(max_length, i - point + 1);
            map.put(ch, i + 1);
        }
        return max_length;
    }
}