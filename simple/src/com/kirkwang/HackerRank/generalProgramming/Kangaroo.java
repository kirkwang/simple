/*
 * 4/24/19 2:02 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

/*
https://www.hackerrank.com/challenges/kangaroo/problem
// If the distance between the kangaroos (x2 - x1) is divisible by how much closer they get in each step (v2 - v1),
// then they will land at the same location at the same time. Otherwise, 1 kangaroo will jump over the other and they will never be at the same location at the same time.
 */
public class Kangaroo {
    public static void main(String[] args) {

        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        System.out.println(kangaroo(x1, v1, x2, v2));

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x1 <= x2) {
            return "No";
        } else if ((x2 - x1) % (v2 - v1) == 0) {
            return "Yes";
        }
        return "No";
    }

}
