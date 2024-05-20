package com.leetcode.easy;

import org.testng.Assert;

/**
 * <a href="https://leetcode.com/problems/power-of-two/description/">...</a>
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * <p>
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 * Example 1:
 * <p>
 * Input: n = 1
 * Output: true
 * Explanation: 20 = 1
 * <p>
 * Example 2:
 * <p>
 * Input: n = 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 * <p>
 * Input: n = 3
 * Output: false
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {

        Assert.assertTrue(isPowerOfTwo(1));
        Assert.assertTrue(isPowerOfTwo(16));
        Assert.assertFalse(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            return n == 1;
        }
    }
}
