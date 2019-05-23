package com.leetcode;

/**
 * Created by kewang on 12/12/17.
 *
 * https://leetcode.com/problems/palindromic-substrings/description/ Example 1: Input: "abc" Output:
 * 3 Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2: Input: "aaa" Output: 6 Explanation: Six palindromic strings: "a", "a", "a", "aa",
 * "aa", "aaa".
 *
 *
 * Answer: https://discuss.leetcode.com/topic/96884/very-simple-java-solution-with-detail-explanation
 */
public class PalindromicSubstrings {

  public static int PalindromicSubstrings(String input) {
    int result = 1;
    if (input.length() == 0) {
      return 0;
    }
    for (int i = 0; i < input.length() - 1; i++) {
      result += checkPalindrom(input, i, i);
        //  result += checkPalindrom(input, i, i + 1);
    }
    return result;
  }

  public static void main(String[] args) {

      int result = PalindromicSubstrings.PalindromicSubstrings("abc");
    System.out.println("This is the result " + result);

      result = PalindromicSubstrings.PalindromicSubstrings("aaa");
    System.out.println("This is the result " + result);

      result = PalindromicSubstrings.PalindromicSubstrings("ababada");
    System.out.println("This is the result " + result);

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
