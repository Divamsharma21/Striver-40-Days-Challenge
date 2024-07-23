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
//     int ans=0;
//     public int maxPathSum(TreeNode root) {
              
//         if(root == null) return 0;
        
//         int leftcount=maxPathSum(root.left);
//         int rightcount=maxPathSum(root.right);
        
//         if(leftcount<=- 1){
//            ans =rightcount+root.val;
//         }
//         else if(rightcount<=0){
//             ans=leftcount+root.val;
//         }
//         else{
//             ans=leftcount+rightcount+root.val;
//         }
        
//         return ans;
//     }
    
    
     int ans=Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root)
    {
        height(root);
        return ans;
    }
    public int height(TreeNode root)
    {
        if (root==null) return 0;
        int lh=Math.max(0,height(root.left));
        int rh=Math.max(0,height(root.right));
        ans=Math.max(ans,lh+rh+root.val);
        return Math.max(lh,rh)+root.val;
    }
}