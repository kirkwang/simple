package com.leetcode.easy;

import org.testng.Assert;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 33
 * Example 2:
 * <p>
 * Input: n = 0
 * Output: false
 * Explanation: There is no x where 3x = 0.
 * Example 3:
 * <p>
 * Input: n = -1
 * Output: false
 * Explanation: There is no x where 3x = (-1).
 */
public class PowerOfThree {
    public static void main(String[] args) {

        Assert.assertTrue(isPowerOfThree(27));
        Assert.assertFalse(isPowerOfThree(0));
        Assert.assertFalse(isPowerOfThree(45));
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
