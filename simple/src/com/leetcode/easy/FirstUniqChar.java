package com.leetcode.easy;
/*
  Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
  <p>
  Example 1:
  <p>
  Input: s = "leetcode"
  Output: 0
  Example 2:
  <p>
  Input: s = "loveleetcode"
  Output: 2
  Example 3:
  <p>
  Input: s = "aabb"
  Output: -1
 */

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Assert.assertEquals(firstUniqChar("leetcode"), 0);
        Assert.assertEquals(firstUniqChar("loveleetcode"), 2);
        Assert.assertEquals(firstUniqChar("aabb"), -1);

    }

}
