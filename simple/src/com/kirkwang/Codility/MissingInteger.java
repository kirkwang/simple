package com.kirkwang.Codility;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by kewang on 11/9/17. For example, given A = [1, 3, 6, 4, 1, 2], the function should
 * return 5. <p> Given A = [1, 2, 3], the function should return 4. <p> Given A = [−1, −3], the
 * function should return 1.
 */

public class MissingInteger {

  public static void main(String[] args) {

    //   Scanner scn = new Scanner(System.in);
    //  int n = scn.nextInt();
    //    int[] A = new int[]{1, 3, 1, 3, 2, 5, 6, 4};
    int[] n = new int[]{1, 3, 4, 6, 2, 1};

    System.out.println(solution(n));
  }

  public static int solution1(int[] A) {
    int max = Integer.MIN_VALUE;
    TreeSet hSet = new TreeSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        //only add positive number
        hSet.add(A[i]);
      }
      if (A[i] > max) {
        max = A[i];
      }
    }
    if (max < 0) {
      return 1;
    }

    int min = (int) hSet.first();
    return min;

  }

  public static int solution(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int max = Integer.MIN_VALUE;
    TreeSet hSet = new TreeSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        //only add positive number
        hSet.add(A[i]);
      }
      if (A[i] > max) {
        max = A[i];
      }
    }
    if (max < 0) {
      return 1;
    }
    int n = hSet.size() + 1;
    max = n * (n + 1) / 2;

    Iterator<Integer> iterator = hSet.iterator();

    while (iterator.hasNext()) {
      max -= iterator.next();
    }

    return (int) max;
  }

  /**
   * Created by kewang on 11/15/17.
   *
   *
   * https://app.codility.com/programmers/lessons/8-leader/dominator/
   *
   * For example, consider array A such that A[0] = 3    A[1] = 4 A[2] =  3 A[3] = 2    A[4] = 3
   * A[5] = -1 A[6] = 3    A[7] = 3
   *
   * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with
   * indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
   */
  public static class Dominator {

    private static int Dominator(int[] A) {
      Map<Integer, Integer> dominator = new HashMap<>();
      int MAX = -1;
      int index = -1;
      for (int i = 0; i < A.length; i++) {
        if (dominator.containsKey(A[i])) {
          dominator.put(A[i], dominator.get(A[i]) + 1);
        } else {
          dominator.put(A[i], 1);
        }

        if (dominator.get(A[i]) > MAX) {
          MAX = dominator.get(A[i]);
          index = i;
        }

      }

      return MAX > (A.length / 2) ? index : -1;
    }

    public static void main(String[] args) {

      int[] A = new int[]{1, 3, 3, 3, 4};
      int[] n = new int[]{2, 1, 1, 1, 3};

      System.out.println(Dominator(A));
    }


  }
}
