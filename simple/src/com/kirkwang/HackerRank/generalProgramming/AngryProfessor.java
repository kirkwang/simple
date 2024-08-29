/*
 * 4/23/19 2:56 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<Integer> list = new ArrayList<>(Arrays.asList(0, -1, 2, 1));
        Assert.assertEquals(angryProfessor(2, list), "NO");

        list = new ArrayList<>(Arrays.asList(-1, -3, 4, 2));
        Assert.assertEquals(angryProfessor(3, list), "YES");

    }

    public static String angryProfessor(int k, List<Integer> a) {

        int count = 0;
        for (int x : a) {
            if (x <= 0) {
                count++;
            }
        }
        return count >= k ? "NO" : "YES";
    }
}
