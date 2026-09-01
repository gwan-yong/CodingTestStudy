class Solution {
    public int maxProfit(int[] prices) {

        int[] dp = new int[prices.length];

        dp[0] = 0;

        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            dp[i] = Math.max(dp[i - 1], profit);
        }

        return dp[prices.length - 1];
    }
}