/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    // // previously processed node.
    // TreeNode prev = null;

    // // Function to flatten a binary tree
    // // to a right next Linked List structure
    public void flatten(TreeNode root) {
        // Base case: If the current
        // node is null, return.
        // if (root == null) {
        //     return;
        // }

        // // Recursive call to
        // // flatten the right subtree
        // flatten(root.right);

        // // Recursive call to
        // // flatten the left subtree
        // flatten(root.left);

        // // At this point, both left and right
        // // subtrees are flattened, and 'prev'
        // // is pointing to the rightmost node
        // // in the flattened right subtree.

        // // Set the right child of
        // // the current node to 'prev'.
        // root.right = prev;

        // // Set the left child of the
        // // current node to null.
        // root.left = null;

        // // Update 'prev' to the current
        // // node for the next iteration.
        // prev = root;


            //it is optimal approach ->mories preorder traversal
         // Initialize a pointer
        // 'curr' to the root of the tree
        TreeNode curr = root;

        // Iterate until 'curr'
        // becomes NULL
        while (curr != null) {
            // Check if the current
            // node has a left child
            if (curr.left != null) {
                // If yes, find the rightmost
                // node in the left subtree
                TreeNode pre = curr.left;
                while (pre.right != null) {
                    pre = pre.right;
                }

                // Connect the rightmost node in
                // the left subtree to the current
                // node's right child
                pre.right = curr.right;

                // Move the entire left subtree to the
                // right child of the current node
                curr.right = curr.left;

                // Set the left child of
                // the current node to NULL
                curr.left = null;
            }

            // Move to the next node
            // on the right side
            curr = curr.right;
    }
}
}