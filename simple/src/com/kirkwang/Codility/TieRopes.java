package com.kirkwang.Codility;

/**
 * Created by kewang on 11/20/17.
 */
public class TieRopes {

  public static int TieRopes(int K, int[] A) {
    int ans = 0;
    int total = 0;
    for (int i : A) {
      total += A[i];
      if (total >= K) { //found # of ropes
        ans++;  //soluation ++
        total = 0; //reset to 0;
      }

    }

    return ans;
  }

  public static void main(String[] args) {

    int[] n = new int[]{5, 4, 3, 2, 1, 0}; //5, 4, 3, 2, 1

    System.out.println(TieRopes(4, n));
  }

}
