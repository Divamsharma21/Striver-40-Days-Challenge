import java.util.*;
class Solution {
    public int findDuplicate(int[] arr) {
    // Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]==nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
        
//        for using frequency array
        int n=arr.length;
        int[] f=new int[n+1];
        for(int i=0;i<n;i++){
            if(f[arr[i]]==0){
                f[arr[i]]+=1;
            }
            else{
                return arr[i];
            }
        }
        return -1;
    }
}