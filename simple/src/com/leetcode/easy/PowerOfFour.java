package com.leetcode.easy;
/**
 * https://leetcode.com/problems/power-of-four/
 * Example 1:
 * <p>
 * Input: n = 16
 * Output: true
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: false
 * Example 3:
 * <p>
 * Input: n = 1
 * Output: true
 */

import org.testng.Assert;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {

        Assert.assertTrue(isPowerOfFour(16));
        Assert.assertFalse(isPowerOfFour(5));
        Assert.assertTrue(isPowerOfFour(1));

    }
}
