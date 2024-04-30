package com.kirkwang.medium;

import java.util.Arrays;
import java.util.HashSet;

/*  Given an array of strings words representing an English Dictionary,
return the longest word in words that can be built one character at a time by other words in words.
    If there is more than one possible answer,
    return the longest word with the smallest lexicographical order.
    If there is no answer, return the empty string.
    https://leetcode.com/problems/longest-word-in-dictionary/
    Input: words = ["a","banana","app","appl","ap","apply","apple"]
    Output: "apple"
    Explanation: Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
*/
public class Longest_Word_in_Dictionary {
    public static void main(String[] args) {

        String[] input = new String[]{"w", "wo", "wor", "worl", "world"};

        Longest_Word_in_Dictionary lwid = new Longest_Word_in_Dictionary();
        String commStr = lwid.longestWord(input);

        System.out.println(commStr);
    }

    public String longestWord(String[] words) {
        String result = "";
        if (words == null || words.length == 0) return result;
        HashSet<String> hs = new HashSet<>();
        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            String word = words[i].substring(0, words[i].length() - 1);

            if (words[i].length() == 1 || hs.contains(words[i].substring(0, words[i].length() - 1))) {
                System.out.println("with substring : " + word + ", no substring : " + words[i]);

                if (words[i].length() > result.length()) {
                    result = words[i];
                }
                hs.add(words[i]);
            }
        }
        return result;
    }
}
