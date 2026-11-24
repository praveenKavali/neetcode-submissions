class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestSeq = 0;
        for (int i=0; i<nums.length; i++) {
            if (!set.contains(nums[i]-1)) {
                int n = nums[i], len = 1;
                while (set.contains(n+1)) {
                    len++;
                    n++;
                }
                longestSeq = Math.max(longestSeq, len);
            }
        }
        return longestSeq;
    }
}
