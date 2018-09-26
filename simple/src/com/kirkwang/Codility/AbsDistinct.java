package com.kirkwang.Codility;

/**
 * Created by kewang on 11/16/17.
 *
 * <p>http://www.geeksforgeeks.org/absolute-distinct-count-array-sorted-absolute-values/
 *
 * <p>For example, consider array A such that: A[0] = -5 A[1] = -3 A[2] = -1 A[3] = 0 A[4] = 3 A[5]
 * = 6
 *
 * <p>The absolute distinct count of this array is 5, because there are 5 distinct absolute values
 * among the elements of this array, namely 0, 1, 3, 5 and 6.
 */
public class AbsDistinct {

  public static Object[] AbsDistinct(int[] A) {
    if (A == null || A.length == 0) {
      return new Object[0];
    }
    java.util.Set set = new java.util.HashSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] < 0) {
        A[i] *= -1;
      }
      set.add(A[i]);
    }

    return set.toArray();
  }

  public static void main(String[] args) {
    int[] n = new int[] {-5, -3, -1, 0, 3, 6}; // 5, 4, 3, 2, 1

    System.out.println(AbsDistinct(n));
  }
}
