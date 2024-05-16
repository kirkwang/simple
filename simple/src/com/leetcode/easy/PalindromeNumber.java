package com.leetcode.easy;

/*
https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        int input = 101;
        System.out.println(pn.isPalindrome(input));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
