/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        
        map.put(root, null);
        stack.push(root);
        
        //add nodes to map until both p and q are found
        while(!map.containsKey(p) || !map.containsKey(q)){
            TreeNode node = stack.pop();
            
            if(node.left != null) {
                stack.push(node.left);
                map.put(node.left, node);
            }
            
            if(node.right != null) {
                stack.push(node.right);
                map.put(node.right, node);
            }
        }
        
        //Add the parents of p to set
        HashSet<TreeNode> set = new HashSet<>();
        
        while(p != null){
            set.add(p);
            p = map.get(p);
        }
        
        
        while(!set.contains(q)){
            q = map.get(q);
        }
        
        return q;
    }
}


//Time complexity : O(N)
//Space complexity : O(N)