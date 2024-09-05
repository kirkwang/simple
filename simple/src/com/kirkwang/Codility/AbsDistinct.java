package com.kirkwang.Codility;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/*

  Created by kewang on 11/16/17.

  http://www.geeksforgeeks.org/absolute-distinct-count-array-sorted-absolute-values/

  <p>For example, consider array A such that: A[0] = -5 A[1] = -3 A[2] = -1 A[3] = 0 A[4] = 3 A[5]
  = 6

  <p>The absolute distinct count of this array is 5, because there are 5 distinct absolute values
  among the elements of this array, namely 0, 1, 3, 5 and 6.
*/

public class AbsDistinct {

    public static int AbsDistinctG4G(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Set set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                A[i] *= -1;
            }
            set.add(A[i]);
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] n = new int[]{-5, -3, -1, 0, 3, 6};

        Assert.assertEquals(AbsDistinctG4G(n), 5);
        Assert.assertEquals(AbsDistinctG4G(new int[]{}), 0);
        Assert.assertEquals(AbsDistinctG4G(new int[]{1}), 1);
    }
}
