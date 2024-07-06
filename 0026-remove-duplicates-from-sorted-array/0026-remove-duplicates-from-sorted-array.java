import java.util.*;

class Solution {
    public int removeDuplicates(int[] arr) {
//    HashSet<Integer> set=new HashSet<>();
//         int k=0;
//          for(int i=0;i<nums.length;i++){
//              if(set.contains(nums[i])){
//                   continue;
//              }
//              else{
//                  set.add(nums[i]);
//                   nums[k++]=nums[i];
             
//              }

//          }

//          return  k;
        
           int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}