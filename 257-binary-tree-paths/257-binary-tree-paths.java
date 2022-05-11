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
    
    private List<String> binaryTreePathsHelper(TreeNode current, String path, List<String> result){
        if(current == null)
            return null;
        
        path = path + current.val;
    
        if(current.left == null && current.right == null) {
            result.add(path);
            path = "";
        }
      
        path = path + "->";
        
        binaryTreePathsHelper(current.left, path, result);
        binaryTreePathsHelper(current.right, path, result);
        
        return result;
        }
        
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null)
            return result;
        
        return binaryTreePathsHelper(root, "", result);
    }
}