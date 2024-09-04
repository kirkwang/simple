package com.leetcode.easy;

import org.testng.Assert;

/*
*https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
* You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.


Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
 */
public class MaxProfit_V2 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }

    public static void main(String[] args) {

        Assert.assertEquals(maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 7);
        Assert.assertEquals(maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
        Assert.assertEquals(maxProfit(new int[]{1, 2, 3, 4, 5}), 4);
    }

}
