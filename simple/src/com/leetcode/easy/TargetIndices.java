package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/find-target-indices-after-sorting-array/
Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
Example 3:

Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

 */
public class TargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] arges) {
        List<Integer> result = targetIndices(new int[]{1, 2, 5, 2, 3}, 5);

        Assert.assertEquals(result.toArray(), new int[]{4});

        result = targetIndices(new int[]{1, 2, 5, 2, 3}, 2);
        Assert.assertEquals(result.toArray(), new int[]{1, 2});

        result = targetIndices(new int[]{1, 2, 5, 2, 3}, 3);
        Assert.assertEquals(result.toArray(), new int[]{3});


    }
}
