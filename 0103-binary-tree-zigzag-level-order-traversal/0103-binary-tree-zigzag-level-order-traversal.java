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
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> ans=new ArrayList<>();
//           zigzag(root,ans,0);  
//         return ans;      
//     }
    
//     public  void zigzag(TreeNode root ,List<List<Integer>> ans ,int l){
       
//         if(root==null) return;
//         if(ans.size()<=l){
//             ans.add(new ArrayList<>());
           
//         }
        
//         if(l%2 ==0){
//             ans.get(l).add(root.val);
//         }else{
//             ans.get(l).add(0,root.val);
//         }
        
    
//        zigzag(root.left,ans,l+1);
//          zigzag(root.right,ans,l+1);
        
//     }
    
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ret = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int l = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            if (node != null) {
                level.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        if (!level.isEmpty()) {
            if (l % 2 == 1) {
                Collections.reverse(level);
            }
            ret.add(level);
        }
        l++;
    }
    return ret;
 }
}
 