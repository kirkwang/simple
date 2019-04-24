/*
 * 4/24/19 11:19 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

    public static void main(String[] args) {

        int[] k = {73, 67, 38, 33};
        System.out.println(gradingStudents(k));
    }

    static int[] gradingStudents(int[] grades) {
        List<Integer> arrayList = new ArrayList();

        for (int i : grades) {
            if (i >= 38) {
                int remainder = i % 5;
                if (remainder > 2) {
                    arrayList.add((i / 5) * 5 + 5);// 13+ 3
                } else {
                    arrayList.add(i);
                }

            } else {
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
