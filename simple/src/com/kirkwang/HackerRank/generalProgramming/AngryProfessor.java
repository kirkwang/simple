/*
 * 4/23/19 2:56 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

/*
https://www.hackerrank.com/challenges/Angry-Professor/problem
Function Description

Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

k: the threshold number of students
a: an array of integers representing arrival times
 */
public class AngryProfessor {
    public static void main(String[] args) {

        int[] B = new int[]{3, -5, -7, 11, 5, 8};
        int[] A = new int[]{0, -1, 2, 1};
        int k = 2;
        System.out.println(angryProfessor(k, A));

    }

    public static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int x : a) {
            if (x <= 0) {
                count++;
            }
        }
        return count >= k ? "NO" : "YES";
    }
}
