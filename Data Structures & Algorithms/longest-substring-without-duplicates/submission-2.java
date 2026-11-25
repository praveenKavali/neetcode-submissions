class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        set.add(s.charAt(left));
        for (int right=1; right<s.length(); right++) {
            char c = s.charAt(right);
            if (set.contains(c)) {
                maxLen = Math.max(maxLen, right - left);
                do {
                    set.remove(s.charAt(left));
                }
                while (s.charAt(left++) != c);
            }
            set.add(c);
        }
        return Math.max(maxLen, set.size());
    }
}
