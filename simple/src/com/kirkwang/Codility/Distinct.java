package com.kirkwang.Codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 11/15/17.
 *
 * <p>https://codility.com/programmers/lessons/6-sorting/distinct/
 *
 * <p>that, given a zero-indexed array A consisting of N integers, returns the number of distinct
 * values in array A.
 *
 * <p>Assume that:
 *
 * <p>N is an integer within the range [0..100,000]; each element of array A is an integer within
 * the range [−1,000,000..1,000,000].
 *
 * <p>For example, given array A consisting of six elements such that: A[0] = 2 A[1] = 1 A[2] = 1
 * A[3] = 2 A[4] = 3 A[5] = 1
 *
 * <p>the function should return 3, because there are 3 distinct values appearing in array A, namely
 * 1, 2 and 3.
 */
public class Distinct {
  public static int hashmapSolutaion01(int A[]) {
    Map<Integer, Integer> map = new HashMap<>();
    if (A == null || A.length == 0) {
      return 0;
    }
    for (int temp : A) {
      if (map.containsKey(temp)) {
        map.put(temp, map.get(temp) + 1);
      } else {
        map.put(temp, 1);
      }
    }
    return map.size();
  }

  public static int hashMapSolution(int A[]) {
    if (A == null || A.length <= 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int aA : A) {
      if (map.containsKey(aA)) {
        map.put(aA, map.get(aA) + 1);

      } else {
        map.put(aA, 1);
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

  public static int findUsingSet(int A[]) {
    if (A == null || A.length == 0) {
      return 0;
    }

    java.util.Set set = new java.util.HashSet<>(); // using HashSet to obtain unique set
    for (int i = 0; i < A.length; i++) {
      set.add(A[i]);
    }
    return set.size();
  }

  public static int sortArray(int A[]) {
    int count = 0;
    if (A == null || A.length == 0) {
      return 0;
    }
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

    int[] n =
        new int[] {
          2, 1, 3, 1, 2, 3
        }; // There is problem with result. There are 3 disct numbers but answer saying 5. I don't
           // get it.
    int[] m = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] o = {6};
    int[] p = {-6, -1, -6};
    int[] q = {};

    //      System.out.println(hashMapSolution(n));
    //    System.out.println(sortArray(n));
    //    System.out.println(sortArray(m));
    //    System.out.println(sortArray(o));
    //    System.out.println(findUsingSet(m));
    System.out.println(sortArray(q));
  }
}
