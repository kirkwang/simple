package com.kirkwang.Codility;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/*
https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
A non-empty array A consisting of N numbers is given. The array is sorted in non-decreasing order. The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.

For example, consider array A such that:

  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
  the function should return 5, as explained above.
Question how about 1?
 */
public class AbsDist {

    public static int AbsDis(int[] input) {
        if (input == null || input.length == 0) {
            return 0;
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                input[i] = input[i] * -1;
            }
            result.add(input[i]);
        }
        return result.size();
    }

    public static void main(String[] args) {
        int[] n = new int[]{-5, -3, -1, 0, 3, 6};

        Assert.assertEquals(AbsDis(n), 5);
        Assert.assertEquals(AbsDis(new int[]{}), 0);
        Assert.assertEquals(AbsDis(new int[]{1}), 1);
    }
}
