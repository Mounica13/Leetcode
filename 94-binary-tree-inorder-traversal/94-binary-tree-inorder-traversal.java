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
    
    private void inOrderTraversalHelper(TreeNode current, List<Integer> list){
       
        if(current != null){
            inOrderTraversalHelper(current.left, list);
            list.add(current.val);
            inOrderTraversalHelper(current.right, list);
        }
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderTraversalHelper(root, list);
        return list;
    }
}