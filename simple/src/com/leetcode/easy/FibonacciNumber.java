/*
 * 5/23/19 3:02 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/fibonacci-number/description/
Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

 */
public class FibonacciNumber {

    public static int fib(int N) {
        if (N == 0) {
            return 0;
        }

        int prev = 0;
        int cur = 1;
        for (int i = 2; i <= N; i++) {
            int next = prev + cur;
            prev = cur;
            cur = next;
        }
        return cur;
    }

    public static void main(String[] args) {

        Assert.assertEquals(fib(4), 3);
        Assert.assertEquals(fib(3), 2);
        Assert.assertEquals(fib(2), 1);
        Assert.assertEquals(fib(0), 0);

    }
}
