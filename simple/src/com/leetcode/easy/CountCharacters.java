package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

 */
public class CountCharacters {
    public static int countCharacters_v1(String[] words, String chars) {
        int total = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < chars.length(); i++) {
            total = total + chars.charAt(i);
        }
        int sum = total;
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                sum = sum - word[i];
            }
            if (sum > 0) {
                result.add(words[i]);
            }
            sum = total;
        }
        int counter = 0;
        for (String s : result) {
            counter += s.length();
        }
        return counter;
    }

    public static int countCharacters(String[] words, String chars) {
        List<String> result = new ArrayList<>();

        for (String string : words) {
            char[] word = string.toCharArray();
            int counter = 0;

            for (char c : word) {
                if (chars.indexOf(c) != -1) {
                    counter++;
                }
            }
            if (counter == word.length) {
                result.add(string);
            }
        }
        int counter = 0;
        for (String s : result) {
            counter += s.length();
        }
        return counter;
    }

    public static void main(String[] args) {
        // some of the test cases are not working.
        String[] words = {"cat", "bt", "hat", "tree"};
        int result;
        result = countCharacters(words, "atach");
        //  result = countCharacters_v1(words, "atach");

        Assert.assertEquals(result, 6);

        words = new String[]{"hello", "world", "leetcode"};
        result = countCharacters(words, "welldonehoneyr");
        //  result = countCharacters_v1(words, "welldonehoneyr");
        Assert.assertEquals(result, 10);

    }
}
