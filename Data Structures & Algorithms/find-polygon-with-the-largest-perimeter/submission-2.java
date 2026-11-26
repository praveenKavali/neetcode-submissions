class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length-1;
        //long[] arr = new long[len+1];
        //arr[0] = nums[0];
        long maxLen = 0;
        for (int i=0; i<len; i++) {
            maxLen += (long) nums[i];
        }
        while (len >= 2) {
            if (nums[len] < maxLen) {
                return maxLen + (long)nums[len];
            }
            len--;
            maxLen -= nums[len];
        }
        return -1;
    }
}
