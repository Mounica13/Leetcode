class Solution {
    
  
    public int[][] merge(int[][] intervals) {
        
       Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
    
        ArrayList<int[]> merge = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] i : intervals){
            if(i[0] <= end) {
                end = Math.max(end , i[1]);
            }
            
            else{
                merge.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
         merge.add(new int[]{start, end});
         return merge.toArray(new int[0][]);
         
    }
}