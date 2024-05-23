package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
https://leetcode.com/problems/unique-number-of-occurrences/description/
Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */

public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int v : map.values()) {
            if (set.contains(v)) {
                return false;
            } else {
                set.add(v);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Assert.assertTrue(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        Assert.assertFalse(uniqueOccurrences(new int[]{1, 2}));
        Assert.assertTrue(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));

    }
}
