/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];    
        int maxProfit = 0;
        int profit;

        for(int i = 0; i < prices.length; i++){
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
// @lc code=end

