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
    int max = 0;
    private int diameterHelper(TreeNode root)
    {
        if(root == null)
            return 0;
        
        
        int lheight = diameterHelper(root.left);
        int rheight = diameterHelper(root.right);
        
        max = Math.max(max, lheight + rheight);
        
        return Math.max(lheight, rheight) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        diameterHelper(root);
        return max;
    }
}