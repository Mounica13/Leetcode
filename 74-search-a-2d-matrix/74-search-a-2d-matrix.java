class Solution {
    
      public boolean searchMatrix(int[][] matrix, int target) {    
         
           int m  = matrix.length;
           if(m == 0)
                return false;
           int n = matrix[0].length;
        
           int left = 0;
           int right = m * n - 1;
          int mid, pivot_element;
           
           while(left <= right)
           {
               mid = (left + right) / 2;
            pivot_element = matrix[mid / n][mid % n];
               if(target == pivot_element)
                   return true;
               else
               {
                   if(target < pivot_element)
                   right = mid - 1;
                  else
                   left = mid + 1;
               }
           }
        
          return false;
    }
}