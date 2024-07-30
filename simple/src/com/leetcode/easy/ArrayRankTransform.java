package com.leetcode.easy;

import org.testng.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/rank-transform-of-an-array/description/
Example 1:

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
Example 2:

Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.
Example 3:

Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]
 */
public class ArrayRankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> myMap = new HashMap<>();
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!myMap.containsKey(temp[i])) {
                myMap.put(temp[i], index++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            temp[i] = myMap.get(arr[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] result;

        result = arrayRankTransform(new int[]{40, 10, 20, 30});

        int[] result_v1 = arrayRankTransform(new int[]{100, 100, 100});
        result_v1 = arrayRankTransform(new int[]{40, 10, 20, 30});
        for (int j : result_v1) {
            System.out.println(j);
        }

        Assert.assertEquals(result.length, 4);
    }
}
