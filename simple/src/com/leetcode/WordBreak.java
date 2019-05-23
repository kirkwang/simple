package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/25/17.
 *
 * https://leetcode.com/problems/word-break/description/
 *
 *
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a
 * space-separated sequence of one or more dictionary words. For example, given s = "leetcode", dict
 * = ["leet", "code"]. Return true because "leetcode" can be segmented as "leet code".
 *
 * The answer is here https://www.jianshu.com/p/d88a7e49987d
 */
public class WordBreak {

  public static boolean WordBreak(String s, List<String> wordDict) {

    return false;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("leet");
    list.add("code");
    String s = "leetCode";
      int sqrt = (int) Math.sqrt(9);

    boolean result = WordBreak(s, list);
    System.out.print(result);
  }

}
