class Solution {
    public int rob(int[] nums) {
        int last = 0, beforeLast = 0;
        for (int num : nums) {
            //We can only stole, if we did not stole before bouse so, we can add current to beforeLast.
            int cur = Math.max(last, beforeLast + num);
            beforeLast = last;
            last = cur;
        }
        return last;
    }
}
