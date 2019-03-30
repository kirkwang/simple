package com.kirkwang.easy;

/**
 * Created by kewang on 12/24/15.
 */
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
@SuppressWarnings("Array")
public class MoveZeros {

  public static void main(String[] args) {
    MoveZeros mz = new MoveZeros();
    int[] sorted = mz.movesZeros(new int[]{1, 0, 2, 30, 0});
    for (int aSorted : sorted) {
      System.out.print(aSorted + " ");
    }
  }

  public int[] movesZeros(int[] numbs) {
    if (numbs == null || numbs.length == 0) {
      return numbs;
    }
    int index = 0;
    for (int i = 0; i < numbs.length; i++) {
      if (numbs[i] != 0) {
        numbs[index++] = numbs[i];
      }

    }
    while (index < numbs.length) {
      numbs[index++] = 0;
    }

    return numbs;
  }

}
