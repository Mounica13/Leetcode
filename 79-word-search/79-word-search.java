class Solution {
    
    private boolean markGrid(char[][] board, int r, int c, int rows, int columns, int count, String word)
    {
      
        if(count == word.length())
            return true;
    
        
       if(r < 0 || r >= rows || c< 0 || c >= columns)
            return false;
     
        if(board[r][c] != word.charAt(count))
            return false;
     
        char temp = board[r][c];
        board[r][c] = 'v';
    
        boolean found = markGrid(board, r - 1, c, rows, columns, count + 1, word)
                      || markGrid(board, r + 1, c, rows, columns, count + 1, word)
                      || markGrid(board, r, c - 1, rows, columns, count + 1, word)
                      || markGrid(board, r, c + 1, rows, columns, count + 1, word);
       
        board[r][c] = temp;
        
       return found;
       
    }
      
        

    public boolean exist(char[][] board, String word) {
        
    
        int k = 0;
    
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                       if (markGrid(board, i, j, board.length, board[0].length, 0, word))
                           return true;
                }
            }
        }
         return false;
    }
       
    
}