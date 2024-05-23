package com.leetcode.easy;
/*
https://leetcode.com/problems/jewels-and-stones/description/
Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 */

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int counter = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        Assert.assertEquals(numJewelsInStones("aA", "aAAbbbb"), 3);
        Assert.assertEquals(numJewelsInStones("z", "ZZ"), 0);

    }
}
