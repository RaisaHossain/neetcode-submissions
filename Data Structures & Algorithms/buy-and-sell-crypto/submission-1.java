class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int max_profit = 0;
        int profit = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length)
        {
            buy = prices[left];
            sell = prices[right];
            if (buy < sell)
            {
                profit = sell - buy;
                max_profit = Math.max(profit, max_profit);
            }
            else{
                left = right;
            }   
            right++;  
        }
        return max_profit;
    }
}
