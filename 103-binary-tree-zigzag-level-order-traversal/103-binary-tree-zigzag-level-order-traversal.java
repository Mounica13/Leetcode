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

//Method 1 : (using stack)

/* class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
     
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
       
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> list = new ArrayList<Integer>();
        
        s1.push(root);
        
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()) {
                TreeNode n = s1.pop();
                list.add(n.val);
                if(n.left != null) {
                    s2.push(n.left);
                }
                if(n.right != null) {
                    s2.push(n.right);
                }
                
            }
            if(!list.isEmpty()){
                result.add(new ArrayList<>(list));
            }
            list.clear();
            
            
            while(!s2.isEmpty()){
                TreeNode n = s2.pop();
                list.add(n.val);
                if(n.right != null) {
                    s1.push(n.right);
                }
                if(n.left != null) {
                    s1.push(n.left);
                }
                
            }
            if(!list.isEmpty()){
                result.add(new ArrayList<>(list));
            }
            list.clear();
        }
        
        return result;
        
    }
} */

//Time complexity: O(n)
//Space complexity :O(n)



//Method 2: Using queue(very efficient)

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int level = 0;
        
        while(!queue.isEmpty()){
            
            List<Integer> levelResult = new ArrayList<>();
            
            int length = queue.size();
            
            for(int i = 0; i < length; i++) {
                TreeNode n = queue.poll();
            
                if(n.left != null) {
                    queue.add(n.left);
                }
            
                if(n.right != null) {
                    queue.add(n.right);
                }
            
                if(level % 2 == 0){
                    levelResult.add(n.val); 
                }
                else{
                    levelResult.add(0, n.val);   
                }
            }
            
            level++;
            result.add(levelResult);
        }
        
        return result;
    }
}

//Time complexity : O(n)
//Space complexit:O(n)