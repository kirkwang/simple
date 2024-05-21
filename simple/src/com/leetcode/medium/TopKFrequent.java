package com.leetcode.medium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class TopKFrequent {
    public static void main(String[] args) {
        //Imcomplete
        Assert.assertEquals(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2), new int[]{1, 2});
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> bucket = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer num : map.keySet()) {
            int frequency = map.get(num);


            bucket.add(map.get(num));
        }
        return nums;
    }
}
