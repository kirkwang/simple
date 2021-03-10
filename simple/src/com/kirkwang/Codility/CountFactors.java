package com.kirkwang.Codility;

/**
 * Created by kewang on 11/16/17.
 * <p>
 * <p>
 * <p>
 * https://codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/start/
 * <p>
 * <p>
 * A positive integer D is a factor of a positive integer N if there exists an integer M such that N
 * = D * M.
 * <p>
 * For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the number of its factors.
 * <p>
 * For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2,
 * 3, 4, 6, 8, 12, 24. There are no other factors of 24.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(sqrt(N)); expected worst-case space complexity is O(1).
 */
public class CountFactors {

    public static int CountFactors_1(int N) {
        int factorsCount = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                factorsCount++; //it can be divied
            }
        }

        factorsCount *= 2; // There are a least two.

        if (N % Math.sqrt(N) == 0) {
            factorsCount--; //less one if sqrt without remainder
        }

        return factorsCount;
    }

    public static int CountFactors(int N) {
        int result = 0;
        int A = N;
//    for (int i = 1; i * i <= A; i++) {
//      if (i * i == A) {
//        return ++result;
//      }
//      if (A % i == 0) {
//        result += 2;
//      }
//    }
//    return result;
//
        int i = 1;
        while (i < Math.sqrt(N)) {
            if (N % i++ == 0) {
                result += 2;
            }

        }
        if (Math.pow(i, 2) == N) {

            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(CountFactors(16));
    }

}
