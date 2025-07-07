package Array;

/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // define the Buy Share Algo
        int price = prices[0];
        int day =0;
        int profit =0;
        // define the for loop
        for(int i=0;i<prices.length;i++){
            if(price>prices[i]){
                price = prices[i];
                day = i;
            }
            else{
                int pro = prices[i]- price;
                if(pro>profit){
                    profit = pro;
                }
            }
        }
        return profit;
    }
}
// @lc code=end

