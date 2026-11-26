class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, current = prices[0];
        for (int price : prices) {
            if (price > current) {
                profit += price - current;
            }
            current = price;
        }
        return profit;
    }
}