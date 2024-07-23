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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
          zigzag(root,ans,0);  
        return ans;      
    }
    
    public  void zigzag(TreeNode root ,List<List<Integer>> ans ,int l){
       
        if(root==null) return;
        if(ans.size()<=l){
            ans.add(new ArrayList<>());
           
        }
        
        if(l%2 ==0){
            ans.get(l).add(root.val);
        }else{
            ans.get(l).add(0,root.val);
        }
        
    
       zigzag(root.left,ans,l+1);
         zigzag(root.right,ans,l+1);
        
    }
}
//    if (cur == null) return;
//     if (res.size() <= level) {
//         res.add(new ArrayList<Integer>());
//     }
//     if (level % 2 == 0) {
//         res.get(level).add(cur.val);
//     }   else {
//         res.get(level).add(0, cur.val);
//     }
//     travel(res, level + 1, cur.left);
//     travel(res, level + 1, cur.right);
// }