class Solution {
    public int climbStairs(int n) {
        return solution2(n);
    }

    int solution1(int n) {
        if (n <= 3) return n;
        int first = 1, second = 2;
        for (int i=2; i<n; i++) {
            int cur = first + second;
            first = second;
            second = cur;
        }
        return second;
    }

    int solution2(int n) {
        if (n <= 3) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i=2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}
