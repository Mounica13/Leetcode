class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length, n = matrix[0].length;
        if(m == 0)
            return false;
        
        int left = 0, right = m * n - 1, mid = 0, pivot = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            pivot = matrix[mid / n][mid % n];
            if(pivot == target)
                return true;
            else {
                if(target < pivot) 
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        
        return false;
    }
}