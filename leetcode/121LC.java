class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int maxProfit = 0;
        int profit;

        for(int i = 1; i < prices.length; i++){
            profit = prices[i] - low;

            if(profit > maxProfit){
                maxProfit = profit;
            }
            if(prices[i] < low){
                low = prices[i];
            }
        }

        return maxProfit;
    }
}