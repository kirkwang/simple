/*
 * 4/25/19 8:01 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
https://www.hackerrank.com/challenges/mark-and-toys/problem
 */
public class MarkAndToys {
    public static void main(String[] args) {

        int[] input = {50, 1, 12, 5, 111, 200, 1000, 10};
        int total = 50;
        List<Integer> prices = new ArrayList<>();
        for (int i : input) {
            prices.add(i);
        }

        Assert.assertEquals(maximumToys(prices, total), 4);
    }

    public static int maximumToys(List<Integer> prices, int k) {
        if (k < 0 && prices.size() == 0) {
            return 0;
        }
        int sum = 0;
        Collections.sort(prices);
        int i;
        for (i = 0; i < prices.size(); i++) {
            if (sum < k) {
                sum = sum + prices.get(i);
            } else {
                return i - 1;
            }
        }
        return i - 1;
    }

}
