class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0, point = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
               point = Math.max(map.get(ch), point); 
            }
            
            result = Math.max(result, i - point + 1);
            map.put(ch, i + 1);
        }
        
        return result;
    }
}