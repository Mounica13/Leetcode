class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
       
        for(int i = 0; i < strs.length; i++) {
           
            char[] ch = new char[strs[i].length()];
            ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted_strs = String.valueOf(ch);
            
            if(!map.containsKey(sorted_strs)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted_strs, list);
            }
            else{
                map.get(sorted_strs).add(strs[i]);
            }
        }
        
        result.addAll(map.values());
        return result;
    }
}