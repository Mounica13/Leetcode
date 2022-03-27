class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count= 0;
        for(String pattern : patterns){
           count = word.contains(pattern) ? count+1 : count;
                
        }
        return count;
    }
}

