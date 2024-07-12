import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  
//     int m=nums1.length;
//         int n=nums2.length;
//         int[] merge=new int[m+n+1];
//         int j=0;
//         for(int i=0;i<n;i++){
//             merge[j++]=nums1[i];
//         }
        
//         for (int i = 0; i < m; i++) {
//             merge[j++] = nums2[i];
//         }
        
//         int l=0,h=merge.length-1;
        
//         while(l<=h){
//         int s=(l+h)/2;
            
//             if(merge[s]==s) return s;
            
//             if(merge[s]>=merge[l])
//                 return l=s+1;
//             else{
//                 h=s-1;
//             }
//         }
        
//         return l;
        
        
          
         int n = nums1.length;
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }
        
        Arrays.sort(merged);
        int total=merged.length;

                if(total%2==1){
                    return merged[total/2];
                }
                else{
                int mid1=merged[total/2-1];
                int mid2=merged[total/2];
                return ((double) mid1+(double)mid2)/2;
                }
    }
}