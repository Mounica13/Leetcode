class Solution {
    
    private void updateColor(int[][] image, int sr, int sc, int newColor, int row, int column, int color) {
        if(sr < 0 || sr >= row || sc < 0 || sc >= column || image[sr][sc] == newColor)
            return;
        
        if(image[sr][sc] == color)
        {
            image[sr][sc] = newColor;
        
            updateColor(image, sr + 1, sc, newColor, row, column, color);
            updateColor(image, sr - 1, sc, newColor, row, column, color);
            updateColor(image, sr, sc + 1, newColor, row, column, color);
            updateColor(image, sr, sc - 1, newColor, row, column, color);
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length, column = image[0].length;
        int color = image[sr][sc];
        updateColor(image, sr, sc, newColor, row, column, color);
        return image;
    }
}

//Time complexity : O(N) // N - number of pixels
//Space complexity : O(N)