/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        connectTwoNodes(root.left, root.right);
        return root;
    }
    
    private void connectTwoNodes(Node n1, Node n2){
        if (n1 == null || n2 == null) return;
        n1.next = n2;
        //Connect two child nodes from the same parent node. 
        connectTwoNodes(n1.left, n1.right);
        connectTwoNodes(n2.left, n2.right);
        //Connect two child nodes aside from each other but from different parent nodes . 
        connectTwoNodes(n1.right, n2.left);
    } 
}