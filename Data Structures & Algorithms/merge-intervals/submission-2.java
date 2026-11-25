class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {              // overlap (touching counts)
                end = Math.max(end, intervals[i][1]);
           } else {
                intervals[left][0] = start;
                intervals[left][1] = end;
                left++;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        intervals[left][0] = start;
        intervals[left][1] = end;
        return Arrays.copyOf(intervals, left + 1);
    }
}
