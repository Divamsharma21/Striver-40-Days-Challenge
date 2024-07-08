class Solution {
    public List<List<Integer>> combinationSum2(int[]arr, int target) {
          Arrays.sort(arr);
         List<List<Integer>> res=new ArrayList<>();
        
        com(res,new ArrayList<Integer>(),arr,target,0 );
        return res;
    }
    public void com( List<List<Integer>>res, ArrayList<Integer>ans,int[]arr,int target,int idx){
         
       
        if(target==0){
            res.add(new ArrayList<Integer>(ans));
    
            return;
        }
     
        
       //check dulicate
        // if pick
        for(int i=idx;i<arr.length;i++){
            if(i!=idx && arr[i]==arr[i-1]){
                continue;

            }
         
            
            if(arr[i]>target){
                break;
            }
  
             ans.add(arr[i]);
              com(res,ans,arr,target-arr[i],i+1);
               //backtack
              ans.remove(ans.size()-1);
      
        
        }

        
    }
}