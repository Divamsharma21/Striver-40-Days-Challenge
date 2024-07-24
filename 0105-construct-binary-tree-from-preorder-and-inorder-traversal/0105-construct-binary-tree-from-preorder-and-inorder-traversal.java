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
   Map<Integer, Integer> map;
    int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        map = new HashMap<>();
        int size = inorder.length;
        for (int i = 0; i < size; ++i){
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, size - 1);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int lo, int hi){
        if (lo > hi)
            return null;
        int var = preorder[index++];
        TreeNode root = new TreeNode(var);
        int cut = map.get(var);
        root.left = helper(preorder, inorder, lo, cut - 1);
        root.right = helper(preorder, inorder, cut + 1, hi);
        return root;
    }
}