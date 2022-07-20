package com.leetcode;

/**
 * Created by kewang on 12/12/17.
 *
 * <p><a href="https://leetcode.com/problems/longest-palindromic-substring/description/">...</a>
 *
 * <p>Input: "babad"
 *
 * <p>Output: "bab"
 *
 * <p>Note: "aba" is also a valid answer.
 *
 * <p>Input: "cbbd"
 *
 * <p>Output: "bb"
 */
public class LongestPalindromicSubstring {

  public static String LongestPalindromicSubstring(String input) {
    int tail = 0;
    int head = 0;

    if (input == null) {
      return null;
    }
    if (input.length() <= 1) {
      return input;
    }
    // ababada
    for (int i = 0; i < input.length() - 1; i++) {
      int len1 = checkPalindromicSubstring(input, i, i);
      int len2 = checkPalindromicSubstring(input, i, i + 1);
      int len = Math.max(len1, len2);
      if (len > tail - head) {
        head = i - (len - 1) / 2; // head is shift left(-) size /2
        tail = i + len / 2;  // tail is i shift right(+) size/2
      }
    }

    return input.substring(head, tail + 1);
  }

  private static int findpalindromicsubstring(String input, int i, int j) {
    while (i >= 0 && j < input.length() && input.charAt(i) == input.charAt(j)) {
      i--;
      j++;
    }
    return j - i - 1;
  }

  private static int checkPalindromicSubstring(String target, int i, int j) {
    while (i >= 0 && j < target.length() && target.charAt(i) == target.charAt(j)) {
      i--;
      j++;
    }
    return j - i - 1;
  }

  public static void main(String[] args) {

    String result = LongestPalindromicSubstring.LongestPalindromicSubstring("ababada");
    System.out.println("This is the result " + result);

    String result1 = LongestPalindromicSubstring.LongestPalindromicSubstring("acbbcd");
    System.out.println("This is the 2nd result " + result1);
  }
}
