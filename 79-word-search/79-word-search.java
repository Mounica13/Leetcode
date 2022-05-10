class Solution {
    
   private boolean searchWord(char[][] board, String word, int m, int n, int row, int column, int count){
       
       if(word.length() == count)
           return true;
       
       if(row < 0 || row >= m || column < 0|| column >= n || board[row][column] == 'v')
           return false;
       
       if(board[row][column] != word.charAt(count))
           return false;
       
       char temp = board[row][column];
       board[row][column] = 'v';
       
       boolean found = searchWord(board, word, m, n, row + 1, column, count + 1)
           || searchWord(board, word, m, n, row - 1, column, count + 1)
           ||searchWord(board, word, m, n, row, column + 1, count + 1)
           ||searchWord(board, word, m, n, row, column - 1, count + 1);
       
       
       board[row][column] = temp;
       return found;
   }
      
    public boolean exist(char[][] board, String word) {
      
     
        if(board == null || word == null){
           return false;
        } 
        
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(searchWord(board, word, m, n, i, j, 0))
                        return true;
                }
            }
        }
        
        return false;
    }
}