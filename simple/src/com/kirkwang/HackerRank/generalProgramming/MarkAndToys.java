/*
 * 4/25/19 8:01 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {

        int[] input = {50, 1, 12, 5, 111, 200, 1000, 10};
        int total = 50;
        System.out.println(maximumToys(input, total));
    }

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        int i;
        for (i = 0; i < prices.length; i++) {
            if (sum >= k) {
                return i - 1;
            } else {
                sum = sum + prices[i];
            }
        }
        return i - 1;
    }
}
