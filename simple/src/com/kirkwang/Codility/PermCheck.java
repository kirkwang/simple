package com.kirkwang.Codility;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kewang on 11/9/17.
 */
public class PermCheck {
    // write your code in Java SE 8
    //  https://app.codility.com/demo/results/trainingXPTFGE-5Y4/
    // to check "permutation"
    // the main idea is as follows:
    // 1. use set to remember which elements have appeared
    // 2. use "for loop" to check if all the elements from "1 to A.length" appeared
    // If all the elements have appeared, then "yes".
    // Otherwise, "no".
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        int[] n = new int[]{2, 1, 3};
        //  int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
        //  solution(n);
        System.out.print(solution(n));
    }

    public static int solution(int[] A) {
        int n = A.length + 1;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }

        return (sum == n ? 1 : 0);
    }

    public static int solutionV1(int[] A) {
        HashSet<Integer> seen = new HashSet<Integer>();

        // repeated elements
        for (int i = 0; i < A.length; i++) {
            if (seen.add(A[i]) == false) return 0;
        }

        // permutation should be of size N
        if (seen.size() != A.length) return 0;

        // check for missing elements
        for (int i = 1; i < A.length; i++) {
            if (!seen.contains(i)) return 0;
        }

        return 1;
    }

}
