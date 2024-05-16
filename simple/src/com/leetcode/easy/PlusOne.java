package com.leetcode.easy;

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
        //int[] input = {1, 2, 3};
        int[] input = {9, 9};
        PlusOne po = new PlusOne();
        int[] result = po.plusOne(input);


        for (int i = 0; i <= input.length; i++) {
            System.out.print(result[i]);
        }
    }

    public int[] plusOne(int[] digits) {
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
