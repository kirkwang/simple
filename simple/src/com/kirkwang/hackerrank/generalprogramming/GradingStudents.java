/*
 * 4/24/19 11:19 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.hackerrank.com/challenges/grading/problem
Examples

 Grade : 84 round to  (85 - 84 is less than 3)
 Grade : 29 do not round (result is less than 40)
 Grade : 57 do not round (60 - 57 is 3 or higher)

73 -> 75
67 -> 67
38 -> 40
33 -> 33
 */
public class GradingStudents {

    public static void main(String[] args) {

        Assert.assertEquals(gradingStudents(Arrays.asList(73, 67, 38, 33)).toArray(), new int[]{75, 67, 40, 33});
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
                    int q = i / 5;
                    result.add(5 * (q + 1));
                }
            }
        }
        return result;
    }


}
