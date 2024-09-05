package com.leetcode.medium;

import org.testng.Assert;

/*
  Created by kewang on 12/12/17.
 
  https://leetcode.com/problems/palindromic-substrings/description/
  Example 1: Input: "abc" Output:
  3 Explanation: Three palindromic strings: "a", "b", "c".
  <p>
  <p>
  Example 2: Input: "aaa" Output: 6 Explanation: Six palindromic strings: "a", "a", "a", "aa",
  "aa", "aaa".
  <p>
  <p>
  Answer: <a href="https://discuss.leetcode.com/topic/96884/very-simple-java-solution-with-detail-explanation">...</a>
 */
public class PalindromicSubstrings {

    public static int PalindromicSubstrings(String s) {
        int result = 1;
        if (s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            result += checkPalindrom(s, i, i);

        }
        return result;
    }

    public static void main(String[] args) {

        int result = PalindromicSubstrings.PalindromicSubstrings("abc");
        Assert.assertEquals(result, 3);

        result = PalindromicSubstrings.PalindromicSubstrings("aaa");
        Assert.assertEquals(result, 4);

        result = PalindromicSubstrings.PalindromicSubstrings("ababada");
        Assert.assertEquals(result, 12);

    }

    private static int checkPalindrom(String target, int left, int right) {
        int count = 0;
        while (left >= 0 && right < target.length() && target.charAt(left) == target.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

}
