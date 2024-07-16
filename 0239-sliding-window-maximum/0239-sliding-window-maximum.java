class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
//         int n=nums.length;
//         int[] res =new int[n-k+1];
        
//      for(int i=0;i<n-k+1;i++){
//           int maxi=Integer.MIN_VALUE;
//          for(int j=i;j<i+k;j++){
//              if(nums[j]>maxi){
//                  maxi=nums[j];
//              }
             
//          }
//        res[i]=maxi;  
//      }
        
//         return res;
//     }
// }


  int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }
}