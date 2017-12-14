package com.leetcode.LengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/13/17.
 *
 * Input: s = "aaabb", k = 3
 *
 * Output: 3
 *
 * The longest substring is "aaa", as 'a' is repeated 3 times.
 *
 * ********************************** Input: s = "ababbc", k = 2
 *
 * Output: 5
 *
 * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 */

@Deprecated // Implete
public class LongestSubstringwithAtLeast_N_DistinctCharacter {


  public static void main(String[] args) {

    int result = LongestSubstringwithAtMost_N_DistinctCharacter("aaabb", 3);
    System.out.println("This is the result " + result);

    int result1 = LongestSubstringwithAtMost_N_DistinctCharacter("ababbc", 2);
    System.out.println("This is the result " + result1);

  }

  public static int LongestSubstringwithAtMost_N_DistinctCharacter(String s, int K) {

    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    int total = 0;
    for (char c : map.keySet()) {
      if (map.get(c) >= K) {
        total += map.get(c);
      }
    }

    return total;
  }

}
