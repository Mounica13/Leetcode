/*class Solution {
    public boolean isAnagram(String s, String t) {
        
        int length1 = s.length();
        int length2 = t.length();
       
        if(length1 != length2)
            return false;
        
        char[] ch  = new char[s.length()];
        ch = s.toCharArray();
        Arrays.sort(ch);
        s = String.valueOf(ch);
        
        ch = t.toCharArray();
        Arrays.sort(ch);
        t = String.valueOf(ch);
        
        if(s.equals(t))
            return true;
        else
            return false;
        
        
    }
}

//Time Complexity : O(n log n)
//Space Complexity : O(1) */




class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            }
        
        for(char ch : map.keySet()){
            if(map.get(ch) != 0)
                return false;
        }
        
        return true;
    }
}




        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap<>();
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){return false;}
        for(int i=0;i<sl;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c:smap.keySet()){
            if(smap.get(c)!=0){return false;}
        }
        
        return true;
    }
}

*/