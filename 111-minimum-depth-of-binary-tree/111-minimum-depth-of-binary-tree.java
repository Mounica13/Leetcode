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
    
    private int minDepthHelper(TreeNode current){
        if(current == null)
            return 0;
        if(current.left == null){
            return minDepthHelper(current.right) + 1;
        }
        if(current.right == null){
            return minDepthHelper(current.left) + 1;
        }
        else{
            return Math.min(minDepthHelper(current.left), minDepthHelper(current.right)) + 1;
        }
    }
    public int minDepth(TreeNode root) {
       if(root == null){
           return 0;
       }
      return minDepthHelper(root);
    }
}