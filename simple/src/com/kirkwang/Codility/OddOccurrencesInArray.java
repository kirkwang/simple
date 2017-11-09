package com.kirkwang.Codility;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        int[] n = new int[]{2, 2, 1, 4, 4};
        // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
        //  solution(n);
        System.out.print(solution(n));
    }

    public static int solution(int[] A) {
        HashSet<Integer> dups = new HashSet<>();

        for (int aA : A) {
            if (dups.contains(aA)) {
                dups.remove(aA);
            } else {
                dups.add(aA);
            }
        }
        return (int) dups.toArray()[dups.size() - 1];

    }
}
