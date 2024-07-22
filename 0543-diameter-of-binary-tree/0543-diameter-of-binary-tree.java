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
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
        
//         int dia1=diameterOfBinaryTree(root.left);
//         int dia2=diameterOfBinaryTree(root.right);
        
//         int dia3= height(root.left)+height(root.right);
        
//         return Math.max(dia3,Math.max(dia1,dia2));
//     }
    
    
//     public int height(TreeNode root){
//         if(root==null)return 0;
        
//         int lefth=height(root.left);
//         int righth=height(root.right);
        
//         return Math.max(lefth,righth)+1;
//     }
    
    
    // o(n)
      int res = 0;

    public int height(TreeNode root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
    }
}