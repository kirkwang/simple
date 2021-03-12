/*
 * 4/22/19 5:43 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// https://www.hackerrank.com/challenges/beautiful-pairs/problem
// For an element in A, if there's a matching element in B, this creates a "beautiful pair".
// Each element can only be used once to create a beautiful pair.

// Additionaly, We MUST change exactly 1 element in B. We attempt to change it to create 
// 1 more beautiful pair. In the special case where we already have the max number of 
// beautiful pairs, being forced to change it gives us 1 less beautiful pair.

//  Time Complexity: O(n)
// Space Complexity: O(1)

@Deprecated // not following
public class BeautifulPair {

    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);

        //  int n = sc.nextInt();
        int[] A = new int[]{5, 7, 11, 10, 5, 8}; //readArray(sc, n);
        int[] B = new int[]{3, 5, 7, 11, 5, 8};//readArray(sc, n);
        System.out.println(solve(A, B));
        //   sc.close();
    }

    static int[] readArray(Scanner sc, int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    static int solve(int[] A, int[] B) {
        Map<Integer, Integer> numberToCountA = buildNumberToCount(A);
        Map<Integer, Integer> numberToCountB = buildNumberToCount(B);

        int matchNum = 0;
        for (int numberA : numberToCountA.keySet()) {
            int a = numberToCountA.get(numberA);
            int b = numberToCountB.getOrDefault(numberA, 0);
            matchNum += Math.min(a, b);
        }

        return matchNum == A.length ? (A.length - 1) : (matchNum + 1);
    }

    static Map<Integer, Integer> buildNumberToCount(int[] numbers) {
        Map<Integer, Integer> numberToCount = new HashMap<>();
        for (int number : numbers) {
            numberToCount.put(number, numberToCount.getOrDefault(number, 0) + 1);
        }
        return numberToCount;
    }
}
