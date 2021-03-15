package com.kirkwang.easy;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Word_in_Dictionary {
    public static void main(String[] args) {

        String[] input = new String[]{"w", "wo", "wor", "worl", "world"};

        Longest_Word_in_Dictionary lwid = new Longest_Word_in_Dictionary();
        String commStr = lwid.longestWord(input);


        // System.out.println(commStr);
        System.out.println(commStr);
    }

    public String longestWord(String[] words) {
        String result = "";
        if (words == null || words.length == 0) return result;
        HashSet<String> hs = new HashSet<>();

        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 1 || hs.contains(words[i].substring(0, words[i].length() - 1))) {
                if (words[i].length() > result.length()) {
                    result = words[i];
                }
                hs.add(words[i]);
            }
        }
        return result;
    }
}
