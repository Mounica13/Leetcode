/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    int diameterHelper(TreeNode* root, int& max_diam)
    {
        if (!root)
            return 0;
        if (!root->left && !root->right)
            return 1;
        
        int lheight = diameterHelper(root->left, max_diam);
        int rheight = diameterHelper(root->right, max_diam);
        
        int new_diam = lheight + rheight;
        if (new_diam > max_diam)
            max_diam = new_diam;
        return 1 + std::max(lheight, rheight);
    }
    int diameterOfBinaryTree(TreeNode* root) {
        
        int max_diam = 0;
        diameterHelper(root, max_diam);
        return max_diam;
    }
};