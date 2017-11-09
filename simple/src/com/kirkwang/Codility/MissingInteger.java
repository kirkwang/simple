package com.kirkwang.Codility;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by kewang on 11/9/17.
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 */

public class MissingInteger {
    public static void main(String[] args) {

        //   Scanner scn = new Scanner(System.in);
        //  int n = scn.nextInt();
        //    int[] A = new int[]{1, 3, 1, 3, 2, 5, 6, 4};
        int[] n = new int[]{1, 3, 4, 6, 2, 1};

        System.out.println(solution(n));
    }

    public static int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        TreeSet hSet = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            hSet.add(A[i]);
        }
        int n = hSet.size() + 1;
        long total = n * (n + 1) / 2;

        Iterator<Integer> iterator = hSet.iterator();

        while (iterator.hasNext()) {
            total -= iterator.next();
        }

        return (int) total;
    }
}
