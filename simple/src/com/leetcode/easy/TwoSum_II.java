package com.leetcode.easy;

import java.util.HashMap;

/**
 * Created by kewang on 12/22/17.
 * <p>
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">...</a>
 * <p>
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same
 * element twice.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */

public class TwoSum_II {


    public static int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;
        while (head <= tail) {
            int sum = numbers[head] + numbers[tail];
            if (sum == target) {
                return new int[]{++head, ++tail};
            } else if (sum < target) {
                head++;
            } else {
                tail--;
            }
        }
        return new int[]{};
    }

    public static int[] TwoSum_III(int[] numbers, int target) {
        //slow but less memory
        //Beats 16.91% of users with Java
        //Beats 97.08% of users with Java
        if (numbers == null || numbers.length < 2) {
            return new int[0];
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(numbers[i])) {
                return new int[]{hashMap.get(numbers[i]) + 1, ++i};
            } else {
                hashMap.put(target - numbers[i], i);
            }
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        result = TwoSum_III(new int[]{1, 2, 7, 15}, 9);
        for (int sum : result) {
            System.out.println(sum);
        }
    }
}
