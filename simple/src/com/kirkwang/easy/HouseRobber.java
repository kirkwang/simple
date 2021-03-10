package com.kirkwang.easy;

/**
 * Created by kewang on 12/24/15.
 */
/*
https://leetcode.com/problems/house-robber/description/

You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.

 */
public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        System.out.print(hr.houseRobber(new int[]{1, 50, 23, 3}));

    }

    public int houseRobber(int[] numbs) {
        if (numbs == null || numbs.length == 0) {
            return 0;
        }

        int even = 0, odd = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (i % 2 == 0) {
                even = even + numbs[i];
                even = Math.max(even, odd);
            } else {
                odd = odd + numbs[i];
                odd = Math.max(even, odd);
            }
        }
        return Math.max(even, odd);
    }
}
