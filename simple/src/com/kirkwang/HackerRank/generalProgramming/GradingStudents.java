/*
 * 4/24/19 11:19 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

    public static void main(String[] args) {

        int[] k = {73, 67, 38, 33};
        List<Integer> grades = new ArrayList<>();
        for (int i : k) {
            grades.add(i);
        }

        Assert.assertEquals(gradingStudents(grades).toArray(), new int[]{75, 67, 40, 33});
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : grades) {
            if (i < 38) {
                result.add(i);

            } else {
                int remainder = i % 5;
                if (remainder < 3) {
                    result.add(i);
                } else {
                    int t = i / 5;
                    result.add(5 * (t + 1));
                }
            }
        }
        return result;
    }


}
