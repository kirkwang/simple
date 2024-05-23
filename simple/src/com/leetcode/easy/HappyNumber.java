package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/description/
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * Example 1:
 * <p>
 * Input: n = 19
 * Output: true
 * Explanation: (2) == square
 * 1(2) + 9(2) = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            n = trans(n);
            if (n == 1) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }

    static int trans(int n) {
        int sum = 0;
        do {
            int t = n % 10;  // get remainder
            sum = sum + t * t; // get the square and sum all
            n /= 10;  //  remove the last digit
        }
        while (n > 0);
        System.out.println(sum);
        return sum;
    }
}
