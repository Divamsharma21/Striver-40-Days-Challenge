class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxi = Integer.MIN_VALUE;
                      int sum=0;

        for(int i=0;i<nums.length;i++){
            
            
            
            sum+=nums[i];
            
            if(sum>maxi){
                maxi=sum;
            }
            
            if(sum<0){
                sum=0;
            }
        
            // for(int j=i;j<nums.length;j++){
            //   // int  sum=0;
            //     sum+=nums[j];
                // for(int k=i;k<=j;k++){
                //     sum+=nums[k];
            //     // }
            //     maxi=Math.max(maxi,sum);
            // }
        }
        return maxi;
    }
}