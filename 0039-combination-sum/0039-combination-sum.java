class Solution {
    public List<List<Integer>> combinationSum(int[]arr, int target) {
        
         List<List<Integer>> res=new ArrayList<>();
        
        com(res,new ArrayList<Integer>(),arr,target,0 );
        return res;
       
    }
    
    public void com( List<List<Integer>>res, ArrayList<Integer>ans,int[]arr,int target,int idx){
        if(arr.length == idx){
        if(target==0){
            res.add(new ArrayList<Integer>(ans));
    
        }
            return;
        }
        
        // if pick
        // if(target>arr[idx]){
           if (arr[idx] <= target) {
             ans.add(arr[idx]);
              com(res,ans,arr,target-arr[idx],idx);
               //backtack
              ans.remove(ans.size()-1);
        }
        
        
        
        // don't pick
        com(res,ans,arr,target,idx+1);
        
    }
}