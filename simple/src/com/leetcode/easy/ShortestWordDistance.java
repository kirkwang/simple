package com.leetcode.easy;

import org.testng.Assert;

import java.util.Objects;

/**
 * Created by kewang on 12/24/15.
 */
/*
https://leetcode.com/problems/shortest-word-distance/description/
Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.
Note:
You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
Understand the problem:
The problem can be solved by one-pass of the array.
Iterate through the array, use two pointers pointing to the index of the word1 and word2, maintain the minimum distance.
 */
@SuppressWarnings("Array")
public class ShortestWordDistance {

    public static void main(String[] args) {
        String[] words = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        ShortestWordDistance rd = new ShortestWordDistance();
        Assert.assertEquals(rd.shortestWordDistance(words, "coding", "practice"), 3);
        Assert.assertEquals(rd.shortestWordDistance(words, "makes", "coding"), 1);

    }

    public int shortestWordDistance(String[] words, String word1, String word2) {
        if (words == null || words.length == 0) {
            return -1;
        }
        int pa = -1;
        int pb = -1;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(word1, words[i])) {
                pa = i;
            }
            if (Objects.equals(word2, words[i])) {
                pb = i;
            }
            if (pa != -1 && pb != -1) {
                minDist = Math.min(minDist, Math.abs(pa - pb));
            }
        }

        return minDist;
    }
}
