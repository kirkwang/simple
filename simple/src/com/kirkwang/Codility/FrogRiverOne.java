package com.kirkwang.Codility;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kewang on 11/9/17.
 *
 *
 * https://codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne {

  public static void main(String[] args) {

    //   Scanner scn = new Scanner(System.in);
    //  int n = scn.nextInt();
    int[] A = new int[]{1, 3, 1, 3, 2, 5, 6, 4};

    System.out.println(solution(5, A));
  }

  public static int solution(int X, int[] A) {
    int steps = -1;
    Set<Integer> values = new TreeSet<Integer>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] <= X) {
        values.add(A[i]);
      }
      if (values.size() == X) {
        steps = i;
        break;
      }
    }
    return steps;

  }
}

