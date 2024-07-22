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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
   int leftc =getheight(root.left);
        
    int rightc=getheight(root.right); 
        if( Math.abs(leftc-rightc)<=1&& isBalanced(root.left) && isBalanced(root.right) ) return true;
        
        return false;
    }
    
    public int getheight(TreeNode root){
         if (root == null) {
            return 0;
        }

         
        int leftHeight = getheight(root.left);
        int rightHeight = getheight(root.right);

        // Return the maximum height of left and right subtrees
        // plus 1 (to account for the current node)
        return Math.max(leftHeight, rightHeight) + 1;
    }
}