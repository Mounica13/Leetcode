class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int area = 0, maxArea = 0, length = 0, breadth = 0;
        while(start < end) {
            area = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(maxArea, area);
            if(height[start] < height[end]) {
                start++;
            }
            else{
               end--; 
            }
        }
        
        return maxArea;
    }
}