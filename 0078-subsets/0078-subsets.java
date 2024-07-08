class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        subset(res,new ArrayList<Integer>(), nums,0);
        return res;
    }

    public void subset(List<List<Integer>> res,ArrayList<Integer>ans,int[] nums,int idx){
        if(nums.length==idx){
            res.add(new ArrayList<Integer>(ans));
            return ;
        }
        // add the element in list
        ans.add(nums[idx]);

        // pick the element 
        subset(res,ans,nums,idx+1);
 
// back track

ans.remove(ans.size()-1);

        //  do not pick
        subset(res,ans,nums,idx+1); 
           }
}