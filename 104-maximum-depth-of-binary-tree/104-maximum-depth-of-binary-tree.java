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
    
   /* public int maxDepthRecursion(TreeNode root, int depth)
    {
        if(root.left != null && root.right != null)
        {
            depth++;
            maxDepthRecursion(root.left, depth);
            maxDepthRecursion(root.right, depth);
        }
        return depth;
    } */
    public int maxDepth(TreeNode root) {
       if(root == null)
           return 0;
       else
           return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        
        
        
        
        /*    if(root == null)
            return 0;
        
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = null;
        queue.add(root);
       
        while(!queue.isEmpty())
        {
            depth++;
            for(int i = 0; i < queue.size(); i++)
            {
              current = queue.remove();
              if(current.left != null)
                  queue.add(current.left);
              if(current.right != null)
                  queue.add(current.right);
            }
            
        }
        return depth; */
        
        
    }
}