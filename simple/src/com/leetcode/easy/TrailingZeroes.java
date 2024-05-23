package com.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/factorial-trailing-zeroes/">...</a>
 * Given an integer n, return the number of trailing zeroes in n!.
 * n = n * (n - 1) * (n - 2)
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 */
public class TrailingZeroes {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        int zeroCount = 0;
        for (int i = 5; i <= n; i += 5) {
            int powerOf5 = 5;
            while (i % powerOf5 == 0) {
                zeroCount++;
                powerOf5 *= 5;
            }
        }
        return zeroCount;
    }
}
