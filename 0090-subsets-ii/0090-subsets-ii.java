class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> res=new ArrayList<>();
        Subset(res,new ArrayList<Integer>(),nums,0);
        return res;
    }
    
    public void Subset(List<List<Integer>> res,ArrayList<Integer>ans,int []nums,int idx){
         
           
        // check duplicate
        if(res.contains(ans)) return;
        
        if(nums.length==idx){
            res.add(new ArrayList<Integer>(ans));
            return;
        }
        
       
        // add all element in list
        
           ans.add(nums[idx]);
        
        // pick 
        Subset(res,ans,nums,idx+1);
        
        // backtraack
        ans.remove(ans.size()-1);
        
        // don't pick
        
        Subset(res,ans,nums,idx+1);
    }
}