package com.leetcode.LengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kewang on 12/12/17.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a
 * substring, "pwke" is a subsequence and not a substring.
 */
public class LengthOfLongestSubstring_Set {

  public static void main(String[] args) {

    int result = LengthOfLongestSubstring_Set("abcabcbb");
    System.out.println("This is the result " + result);

    int result1 = LengthOfLongestSubstring_Set("pwwkew");
    System.out.println("This is the result " + result1);

  }

  public static int LengthOfLongestSubstring_Set(String input) {
    int n = input.length();
    int head = 0;
    int tail = 0;
    int ans = 0;

    Set<Character> set = new HashSet<>();

    while (head < n && tail < n) {
      if (!set.contains(input.charAt(tail))) {
        set.add(input.charAt(tail++));
        ans = Math.max(ans, tail - head);
      } else {
        set.remove(input.charAt(head++));
      }
    }
    return ans;
  }


}
