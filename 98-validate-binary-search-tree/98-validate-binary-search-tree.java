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


//Method 1:
 class Solution {
     
     private boolean isValid(TreeNode root, long min, long max){
         if(root == null)
             return true;
         
         if(root.val <= min || root.val >= max)
             return false;
         
         return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
     }
    
     
     public boolean isValidBST(TreeNode root) {
         return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
         
     }
 }

/*Method 2: Inorder traversal and check if its sorted or not.

   class Solution {
    
    private List<Integer> inOrderTraversal(TreeNode current, List<Integer> list){
       
        if(current != null){
            inOrderTraversal(current.left, list);
            list.add(current.val);
            inOrderTraversal(current.right, list);
        }
        
        return list;
    }
    
    private boolean compareList(List<Integer> list){
        boolean compare = true;
       
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i + 1) <= list.get(i)){
                compare = false;
                break;
            }
        }
        return compare;
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = inOrderTraversal(root, list);
        return compareList(list);
    }
} 

Time complexity : O(n)
Space complexity : O(n)
*/

