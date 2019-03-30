package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/27/15.
 */
/*
Given a string, determine if a permutation of the string could form a palindrome.
For example,
"code" -> False, "aab" -> True, "carerac" -> True.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        PalindromePermutation pp = new PalindromePermutation();
        System.out.print(pp.palindromePermutation("abcdddabcabcda"));
    }

    /*
    * "code"->false, "aab"-> true, "carerac" -> true
     */
    public boolean palindromePermutation(String source) {
        Map<Character, Integer> m = new HashMap();

        for (int i = 0; i < source.length(); i++) {
            if (m.containsKey(source.charAt(i))) {
                m.put(source.charAt(i),  m.get(source.charAt(i)) + 1);
            } else {
                m.put(source.charAt(i), 1);
            }
        }
        int single = 0;
        for (int i : m.values()) {
            if (i % 2 != 0) {
                single++;
            }
        }
        return single <= 1;
    }
}
