//Solution 1:

/* class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
      for(int i = 0; i < s.length(); i++){
          if(map.get(s.charAt(i)) == 1){
              return i;
          }
      }
        
        return -1;
    }
}

//Time complexity : O(n)
//Space complexity : O(1) */
  

//Solution 2:

class Solution {
    public int firstUniqChar(String s) {
        
        //Since lowercase, create an array of size 26
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }
        
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(arr[index] == 1){
                return i;
            }
        }
        
        return -1;
    }
}

//Time complexity : O(n)
//Space complexity : O(1)
