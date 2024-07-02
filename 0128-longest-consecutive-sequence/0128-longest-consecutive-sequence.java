class Solution {
    public int longestConsecutive(int[] nums) {
         
//   int n = nums.length;
//         if (n == 0) return 0;
 
//         int count=0;
//      int lastnum= Integer.MIN_VALUE;
//         int longest=1;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
          
//                  if(nums[i]-1==lastnum){
//                      count++;
//                      lastnum=nums[i];
//                  }
           
//             else if(nums[i]!=lastnum){
//                count=1;
//                 lastnum=nums[i];
//             }
//              longest=Math.max(longest,count);
//         }
        
//         return longest;
        
         int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}


 