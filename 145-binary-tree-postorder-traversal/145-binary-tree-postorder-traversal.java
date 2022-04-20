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
    
    private List<Integer> postorderTraversalHelper(TreeNode current, List<Integer> list){
        if(current != null) {
            postorderTraversalHelper(current.left, list);
            postorderTraversalHelper(current.right, list);
            list.add(current.val);
        }
        return list;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        return postorderTraversalHelper(root, list);
    }
}