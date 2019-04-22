/*
 * 4/22/19 7:19 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class NewYorkChoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < q.length; i++) {
                q[i] = sc.nextInt();
            }

            int solution = solve(q);
            System.out.println(solution >= 0 ? solution : "Too chaotic");
        }

        sc.close();
    }

    static int solve(int[] q) {
        //	q = new int[]{2 ,1, 5, 3, 4};
        if (!isValid(q)) {
            return -1;
        }

        int swapNum = 0;
        LinkedList<Integer> target = new LinkedList<>(Arrays.stream(q).sorted().boxed().collect(Collectors.toList()));
        for (int number : q) {
            int index = target.indexOf(number);
            if (index >= 3) {
                return -1;
            }

            swapNum += index;
            target.remove(index);
        }
        return swapNum;
    }

    static boolean isValid(int[] q) {
        return Arrays.stream(q).min().getAsInt() == 1 && Arrays.stream(q).max().getAsInt() == q.length
                && Arrays.stream(q).distinct().count() == q.length;
    }
}
