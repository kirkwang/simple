package com.leetcode.medium;

import org.testng.Assert;

/**
 * Created by kewang on 12/13/17.
 */

/*
https://leetcode.com/problems/reverse-integer/description/
Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

 */
public class ReverseInteger {

    public static int reverse(int input) {
        long result = 0;
        while (input != 0) {
            long temp = input % 10;
            result = result * 10 + temp;
            input = input / 10;
        }


        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;

    }

    public static void main(String[] args) {


        Assert.assertEquals(ReverseInteger.reverse(-456), -654);
        Assert.assertEquals(ReverseInteger.reverse(120), 21);
        Assert.assertEquals(ReverseInteger.reverse(123), 321);

        Assert.assertEquals(ReverseInteger.reverse(153423646), 646324351);

    }

}
