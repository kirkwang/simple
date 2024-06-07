package com.leetcode.medium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kewang on 12/25/17.
 * <p>
 * <a href="https://leetcode.com/problems/word-break/description/">...</a>
 * <p>
 * <p>
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a
 * space-separated sequence of one or more dictionary words.
 * For example, given s = "leetcode", dict
 * = ["leet", "code"]. Return true because "leetcode" can be segmented as "leet code".
 * <p>
 * The answer is here <a href="https://www.jianshu.com/p/d88a7e49987d">...</a>
 */
public class WordBreak {

    public static boolean wordBreak_v1(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int j = 1; j < dp.length; j++) {
            for (int i = 0; i < j; i++) {
                if (dp[i] && dict.contains(s.substring(i, j))) {
                    dp[j] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        Assert.assertTrue(wordBreak_v1("leetcode", list));

        list.clear();
        list.add("apple");
        list.add("pen");
        Assert.assertTrue(wordBreak_v1("applepenapple", list));


        list.clear();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");
        Assert.assertFalse(wordBreak_v1("catsandog", list));
    }

}
