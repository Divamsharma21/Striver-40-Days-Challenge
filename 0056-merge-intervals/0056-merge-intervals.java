class Solution {
    public int[][] merge(int[][] intervals) {
          if (intervals.length <= 1) {
			return intervals;
        }
        
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        List<int[]> result = new ArrayList<>();
		for (int[] interval : intervals) {
            // if list is empty or does not overlap with the previous, just append
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // if overlap, merge the current and previous intervals
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
		}

		return result.toArray(new int[result.size()][]);
    }
}