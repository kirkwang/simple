package com.leetcode.LengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/13/17.
 * <p>
 * Input: s = "aaabb", k = 3
 * <p>
 * Output: 3
 * <p>
 * The longest substring is "aaa", as 'a' is repeated 3 times.
 * <p>
 * ********************************** Input: s = "ababbc", k = 2
 * <p>
 * Output: 5
 * <p>
 * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 * https://discuss.leetcode.com/topic/33537/java-o-n-explain-how-i-come-up-with-this-idea
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
