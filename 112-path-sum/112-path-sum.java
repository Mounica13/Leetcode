/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private boolean hasPathSumHelper(TreeNode root, int target){
        if(root == null)
            return false;
    
        if(root.val == target && root.left == null && root.right == null)
            return true;
        
       if(hasPathSumHelper(root.left, target - root.val) || hasPathSumHelper(root.right, target - root.val))
          return true;
        
       return false;
      
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, targetSum);
    }
}