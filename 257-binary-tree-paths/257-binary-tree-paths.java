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
    
    public void binaryTreepathsRecursion(TreeNode current, String path, List<String> pathlist)
    {
        if(current == null)
            return;
        
        path = path + String.valueOf(current.val);
        
        if(current.left == null && current.right == null)
            pathlist.add(path);
        
       path = path + "->";
     
       binaryTreepathsRecursion(current.left, path, pathlist);
       binaryTreepathsRecursion(current.right, path, pathlist);
        
      // return pathlist;
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root == null)
            return null;
    
        List<String> pathlist = new LinkedList<>();
        
        binaryTreepathsRecursion(root,"", pathlist);
        
        return pathlist;
    }
}


































