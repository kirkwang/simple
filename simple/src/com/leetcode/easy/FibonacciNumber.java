/*
 * 5/23/19 3:02 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

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

        int n = fib(4);
        System.out.println(n);

    }
}
