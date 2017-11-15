package com.kirkwang.Codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 11/15/17.
 */
public class Distinct {

  public static int hashMapSolution(int A[]) {
    if (A == null || A.length <= 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      if (map.containsKey(A[i])) {
        map.put(A[i], map.get(A[i]) + 1);

      } else {
        map.put(A[i], 1);
      }

    }
    for (int i : map.keySet()) {
      int count = map.get(i);
      if (count == 1) {
        return i;
      }
    }
    return 0;
  }

  public static int sortArray(int A[]) {
    int count = 0;
    Arrays.sort(A);
    for (int i = 1; i < A.length; i++) {
      if (A[i - 1] == A[i]) {
        count++;
      }
      return A.length - count;
    }
    return 0;
  }

  public static void main(String[] args) {

    int[] n = new int[]{2, 1, 3, 1, 2,
        3}; //There is problem with result. There are 3 disct numbers but answer saying 5. I don't get it.
    int[] m = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] o = {6};
    int[] p = {-6, -1, -6};
    int[] q = {};

    System.out.println(sortArray(n));
    System.out.println(sortArray(m));
    System.out.println(sortArray(o));
    System.out.println(sortArray(p));
    System.out.println(sortArray(q));
  }

}
