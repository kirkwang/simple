package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestUniqueSubsttr {
    static boolean isVisited(String input, int i, int j) {
        boolean[] visited = new boolean[26];
        for (int k = i; k <= j; k++) {
            if (visited[input.charAt(k) - 'a']) {
                return false;
            }
            visited[input.charAt(k) - 'a'] = true;
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        String input = s;
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

    static int longestUniqueSubsttr(String input) {
        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                if (isVisited(input, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println("The input string is " + str);

        int len = lengthOfLongestSubstring(str);

        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);
    }
}
