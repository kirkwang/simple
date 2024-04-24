package com.kirkwang.easy;


/**
 * Created by kewang on 11/15/17. For example, consider the following array A consisting of six
 * elements such that: A[0] = 23171 A[1] = 21011 A[2] = 21123 A[3] = 21366 A[4] = 21013 A[5] =
 * 21367
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 * If a share was bought on day 0 and sold on day 2, a loss of 2048 would occur because A[2] − A[0]
 * = 21123 − 23171 = −2048. If a share was bought on day 4 and sold on day 5, a profit of 354 would
 * occur because A[5] − A[4] = 21367 − 21013 = 354. Maximum possible profit was 356. It would occur
 * if a share was bought on day 1 and sold on day 5.
 * Best Time to Buy and Sell Stock
 */
public class MaxProfit {

    public static int MaxProfit(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) { //from the beginning
            for (int j = A.length - 1; j > i; j--) { // from the end
                int profit = A[j] - A[i];   // find the differance
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {

        int[] A = new int[]{23171, 21011, 21123, 21366, 21013, 21367};
        int[] n = new int[]{7,1,5,3,6,4}; //5, 4, 3, 2, 1


        System.out.println(MaxProfit(n));
    }
}
