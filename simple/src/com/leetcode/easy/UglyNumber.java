package com.leetcode.easy;

import org.testng.Assert;

/**
 * <a href="https://leetcode.com/problems/ugly-number/">...</a>
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * <p>
 * Given an integer n, return true if n is an ugly number.
 * Example 1:
 * <p>
 * Input: n = 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: true
 * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 * Example 3:
 * <p>
 * Input: n = 14
 * Output: false
 * Explanation: 14 is not ugly since it includes the prime factor 7.
 */
public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        int[] uglyNumbers = {2, 3, 5};
        for (int i : uglyNumbers) {
            while (n % i == 0) {
                n = n / i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Assert.assertTrue(isUgly(6));
        Assert.assertTrue(isUgly(1));
        Assert.assertFalse(isUgly(14));
    }
}
