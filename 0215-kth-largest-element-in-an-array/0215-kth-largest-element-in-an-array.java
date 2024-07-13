import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
//            MinHeap minHeap = new MinHeap(k);
//         for (int i = 0; i < k; i++) {
//             minHeap.Insert(nums[i]);
//         }
        
//         for (int i = k; i < nums.Length; i++) {
//             if (nums[i] > minHeap.Peek()) {
//                 minHeap.Pop();
//                 minHeap.Insert(nums[i]);
//             }
//         }
        
//         return minHeap.Peek();
        
        
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        return minHeap.peek();
    }
}