package com.leetcode.medium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/23/17.
 * <p>
 * <p>
 * <a href="https://leetcode.com/problems/3sum/description/">...</a>
 * <p>
 * <p>
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of zero.
 * <p>
 * Note: The solution set must not contain duplicate triplets.
 * <p>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 */
@Deprecated // not coded yet
public class ThreeSum_I {

    public static int[] ThreeSum_I_basedOn2forloop(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] + input[i] == 0) {
                    return new int[]{
                            input[i], input[j]
                    };
                }
            }
        }
        return null;
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int expectedSum = -nums[i];
            int[] locationList = TwoSum_II(nums, i + 1, expectedSum);

            if (nums[i] + nums[locationList[0] - 1] + nums[locationList[1] - 1] == 0) {
                List<Integer> o = new ArrayList<>();
                o.add(nums[i]);
                o.add(nums[locationList[0] - 1]);
                o.add(nums[locationList[1] - 1]);
                result.add(o);
            }

        }

        return result;
    }

    public static int[] TwoSum_II(int[] numbs, int index, int total) {

        int head = index;
        int tail = numbs.length - 1;

        while (head < tail) {

            int sum = numbs[tail] + numbs[head];

            if (sum == total) {
                return new int[]{head + 1, tail + 1};
            } else if (sum < total) {
                head++;
            } else {
                tail--;
            }

        }
        head = Math.min(head, tail);
        return new int[]{head + 1, tail + 1};
    }

    public static void main(String[] args) {

        //   List<List<Integer>> result = ThreeSum_I_basedOn2endsWhileLoop(new int[]{-1, 0, 1, 2, -1});
        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        al.add(-1);
        al.add(0);
        al.add(1);
        List<Integer> al1 = new ArrayList<>();
        al1.add(-1);
        al1.add(-1);
        al1.add(2);
        List<Integer> al2 = new ArrayList<>();
        al2.add(-4);
        al2.add(2);
        al2.add(2);

        list.add(al2);
        list.add(al1);
        list.add(al);
        Assert.assertEquals(result, list);
        // List<List<Integer>> result = ThreeSum_I_basedOn2endsWhileLoop(new int[]{1, 0, -4});

    }


}
