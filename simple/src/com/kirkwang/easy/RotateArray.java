package com.kirkwang.easy;

/**
 * Created by kewang on 12/25/15.
 */
/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
*/
@SuppressWarnings("Array")
public class RotateArray {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 6, 8};
    int[] array1 = {1, 2, 3, 4, 5, 6};
    RotateArray.intermediaArray(array1, 2);
    System.out.println("intermediaArray");
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }

  }

  public static int[] intermediaArray(int[] input, int count) {
    for (int i = 0; i < count; i++) {
      routeByOne(input, input.length);
    }

    return input;
  }

  private static int[] routeByOne(int[] array, int length) {
    //[1,2,3,4,5,6,7]
    //[2,3,4,5,6,7,1]
    int temp = array[0];
    for (int i = 0; i < length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[length - 1] = temp;
    return array;
  }


}
