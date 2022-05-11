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
    
    private int minDepthHelper(TreeNode root){
        if(root == null)
            return 0;
        
        if(root.left == null)
            return minDepthHelper(root.right) + 1;
        
        if(root.right == null)
            return minDepthHelper(root.left) + 1;
        
        return Math.min(minDepthHelper(root.left), minDepthHelper(root.right)) + 1;
    }
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        return minDepthHelper(root);
    }
}