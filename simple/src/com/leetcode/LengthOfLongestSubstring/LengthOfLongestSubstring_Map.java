package com.leetcode.LengthOfLongestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by kewang on 12/12/17.
 *
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
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
public class LengthOfLongestSubstring_Map {

  public static int LengthOfLongestSubstring_Map(String input) {
    int ans = 0;
    int head = 0;
    //int tail = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int tail = 0; tail < input.length(); tail++) {
      if (map.containsKey(input.charAt(tail))) {
        head = Math.max(map.get(input.charAt(tail)), head);
      }
      ans = Math.max(ans, tail - head + 1);
      map.put(input.charAt(tail), tail + 1);
    }
    return ans;
  }

    private static int lengthOfLongestSubstringSet(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

  public static void main(String[] args) {
      String input = "abcabcbb";
      //   int result = LengthOfLongestSubstring_Map(input);
      //   System.out.println("This is the result " + result);

      // input = "pwwkew";
      int result1 = LengthOfLongestSubstring_Map(input);
      result1 = lengthOfLongestSubstringSet(input);
      System.out.println("This is the result " + result1);

  }
}
