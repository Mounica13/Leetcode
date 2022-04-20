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
    
    private int maxDepthHelper(TreeNode current){
        if(current == null) {
            return 0;
        }
        else{
            return Math.max(maxDepthHelper(current.left), maxDepthHelper(current.right)) + 1;
        }
    }
   
    public int maxDepth(TreeNode root) {
      if(root == null){
          return 0;
      }
      
      return maxDepthHelper(root);
    }
}

//Time complexity : O(n)
//Space complexity : O(n)