class Solution {
    
    private boolean markGrid(char[][] board, int i, int j, int row, int column,int count, String word) {
        
        if(count == word.length())
            return true;
        
        if(i < 0 || i >= row || j < 0 || j >= column || board[i][j] == 'v') 
            return false;
        
        if(board[i][j] != word.charAt(count))
           return false;
        
        char temp = board[i][j];
        board[i][j] = 'v';
        
        boolean found = markGrid(board, i, j - 1, row, column, count + 1, word)
        || markGrid(board, i, j + 1, row, column, count + 1, word)
         || markGrid(board, i - 1, j, row, column, count + 1, word)
        || markGrid(board, i + 1, j, row, column, count + 1, word);
        
        board[i][j] = temp;
        
        return found;
    }
    public boolean exist(char[][] board, String word) {
      
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)) {
                    if(markGrid(board, i, j, board.length, board[0].length, 0, word))
                        return true;
                }
            }
        }
        return false;
    }
}