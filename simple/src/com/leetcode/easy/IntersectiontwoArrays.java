package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/">...</a>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectiontwoArrays {
    public static void main(String[] args) {

        Assert.assertEquals(retainAll(new int[]{1, 2, 2, 1}, new int[]{2, 2}), new int[]{2});
        Assert.assertEquals(retainAll(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}), new int[]{4, 9});

        Assert.assertEquals(twoSets(new int[]{1, 2, 2, 1}, new int[]{2, 2}), new int[]{2});
        Assert.assertEquals(twoSets(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}), new int[]{4, 9});

    }

    public static int[] retainAll(int[] nums1, int[] nums2) {
        Set<Integer> source = new HashSet<>();
        Set<Integer> target = new HashSet<>();

        for (int i : nums1) {
            source.add(i);
        }
        for (int i : nums2) {
            target.add(i);
        }
        source.retainAll(target);

        int[] result = new int[source.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) source.toArray()[i];
        }
        return result;
    }

    public static int[] twoSets(int[] nums1, int[] nums2) {
        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();

        for (int n : nums1) {
            one.add(n);
        }
        for (int n : nums2) {
            if (one.contains(n))
                two.add(n);
        }
        int[] result = new int[two.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) two.toArray()[i];
        }

        return result;

    }
}
