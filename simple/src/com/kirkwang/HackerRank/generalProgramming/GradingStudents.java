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
        List<Integer> grades = new ArrayList<>();
        for (int i : k) {
            grades.add(i);
        }
        for (Integer i : gradingStudents(grades)) {
            System.out.println(i);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : grades) {
            if (i < 38) {
                arrayList.add(i);
            } else {
                int remainder = i % 5;
                if (remainder > 2) {
                    int temp = (i / 5) * 5 + 5;
                    arrayList.add(temp);
                } else {
                    arrayList.add(i);
                }
            }
        }
        return arrayList;
    }
}
