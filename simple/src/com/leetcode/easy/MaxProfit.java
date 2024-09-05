package com.leetcode.easy;


import org.testng.Assert;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class MaxProfit {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxP = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            maxP = Math.max(maxP, price - min);
        }
        return maxP;
    }

    public static void main(String[] args) {

        int[] n = new int[]{7, 1, 5, 3, 6, 4}; //5, 4, 3, 2, 1
        Assert.assertEquals(maxProfit(n), 5);
        Assert.assertEquals(maxProfit(new int[]{7, 6, 4, 3, 1}), 0);

    }
}
