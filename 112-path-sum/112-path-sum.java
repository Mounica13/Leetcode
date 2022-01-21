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
    
    public boolean hasPathSumRecursion(TreeNode current, int targetSum)
    {
        if(current == null)
            return false;
        
       if(current.val == targetSum && current.left == null && current.right == null)
        return true;
        
        if(hasPathSumRecursion(current.left, targetSum - current.val) || hasPathSumRecursion(current.right, targetSum - current.val))
            return true;
        
        
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return false;
        
         return hasPathSumRecursion(root, targetSum);
    
    }
}

   
        