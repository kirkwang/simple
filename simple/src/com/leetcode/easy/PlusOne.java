package com.leetcode.easy;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/*
https://leetcode.com/problems/plus-one/description/
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
public class PlusOne {
    public static void main(String[] args) {

        assertArrayEquals(new int[]{1, 0}, PlusOne.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 2, 4}, PlusOne.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 3}, PlusOne.plusOne(new int[]{4, 3, 2, 2}));
        assertArrayEquals(new int[]{9, 1, 0,}, PlusOne.plusOne(new int[]{9, 0, 9}));

    }

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        for (int i = 0; i < digits.length; i++)
            if (digits[digits.length - 1 - i] < 9) {
                digits[digits.length - 1 - i]++;
                return digits;
            } else {
                digits[digits.length - 1 - i] = 0;
            }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
