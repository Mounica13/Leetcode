class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        int total = 0, i = 0;
        int currentValue = 0, nextValue = 0;
        String currentSymbol = null, nextSymbol = null;
        
        while(i < s.length()) {
            currentSymbol = s.substring(i, i + 1);
            currentValue= map.get(currentSymbol);
            
            nextValue = 0;
            if(i + 1 < s.length()) {
             nextSymbol = s.substring(i + 1, i + 2);
             nextValue = map.get(nextSymbol);
            }
            
           if(currentValue >= nextValue){
               total += currentValue;
               i++;
           }
         
           else{
                total = total + (nextValue - currentValue);
                i = i + 2;
            }
            
        }
        
        return total;
        
    }
}