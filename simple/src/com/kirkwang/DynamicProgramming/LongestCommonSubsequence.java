package com.kirkwang.DynamicProgramming;

/**
 * Created by kewang on 11/22/17.
 */
public class LongestCommonSubsequence {

  public static int LongestCommonSubsequence(char[] a, char[] b, int a_size, int b_size) {
    if (a_size == 0 || b_size == 0) {
      return 0;
    }
    if (a[a_size - 1] == b[b_size - 1]) {
      return 1 + LongestCommonSubsequence(a, b, a_size - 1, b_size - 1);
    } else {
      return Math.max(LongestCommonSubsequence(a, b, a_size, b_size - 1),
          LongestCommonSubsequence(a, b, a_size - 1, b_size));
    }

  }

  public static void main(String[] args) {

    int[] m = new int[]{1, 3, 7, 9, 9};
    int[] n = new int[]{5, 6, 8, 9, 10};
    String a = "AGGTAB";  //common 4
    String b = "GXTXAYB";

    //   String a = "ABCDGH";  //common 3
    //  String b = "AEDFHR";

    char[] a_array = a.toCharArray();
    char[] b_array = b.toCharArray();

    System.out.println(
        LongestCommonSubsequence(a_array, b_array, a_array.length, b_array.length));
  }

}
