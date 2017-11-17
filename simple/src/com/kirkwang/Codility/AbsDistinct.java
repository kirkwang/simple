package com.kirkwang.Codility;

/**
 * Created by kewang on 11/16/17. For example, consider array A such that: A[0] = -5 A[1] = -3 A[2]
 * = -1 A[3] =  0 A[4] =  3 A[5] =  6
 *
 * The absolute distinct count of this array is 5, because there are 5 distinct absolute values
 * among the elements of this array, namely 0, 1, 3, 5 and 6.
 */
public class AbsDistinct {

  public static int AbsDistinct(int[] A) {

    java.util.Set set = new java.util.HashSet<>();
    for (int i = 0; i < A.length; i++) {
      set.add(Math.abs(A[i]));
    }

    return set.size();
  }

  public static void main(String[] args) {
    int[] n = new int[]{-5, -3, -1, 0, 3, 6}; //5, 4, 3, 2, 1

    System.out.println(AbsDistinct(n));
  }

}
