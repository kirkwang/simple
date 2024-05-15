package com.leetcode;

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
 * space-separated sequence of one or more dictionary words. For example, given s = "leetcode", dict
 * = ["leet", "code"]. Return true because "leetcode" can be segmented as "leet code".
 * <p>
 * The answer is here <a href="https://www.jianshu.com/p/d88a7e49987d">...</a>
 */
public class WordBreak {

    public static boolean WordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        boolean[] result = new boolean[s.length() + 1];
        result[0] = true;
        for (int i = 1; i <= s.length(); i++)
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j, i))) {
                    result[i] = true;
                    break;
                }
            }
        return result[s.length()];
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        String s = "leetcode";

        boolean result = WordBreak(s, list);
        System.out.print(result);
    }

}
