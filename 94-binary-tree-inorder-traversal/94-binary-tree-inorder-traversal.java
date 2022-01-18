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
    
    public void inorderTraversalRecursion(TreeNode root, List<Integer> list)
    {
        if(root != null)
        {
        
        inorderTraversalRecursion(root.left, list);
        list.add(root.val);
        inorderTraversalRecursion(root.right, list);
        }
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        inorderTraversalRecursion(root, list);
        
        return list;
    }
}