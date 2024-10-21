/*
 * 4/26/19 2:19 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/mars-exploration/problem
SOSSPSSQSSOR -> 3
SOS SP(1)S SQ(2)S SOR(3,4)
 */
public class MarsExploration {
    public static int marsExploration(String s) {
        int result = 0;
        for (int i = 0, j = i + 3; i < s.length(); ) {
            String temp = s.substring(i, j);
            result = result + matcher(temp);

            i = i + 3;
            j = j + 3;
        }
        return result;
    }

    static int matcher(String target) {
        int counter = 0;
        for (int k = 0; k < target.length(); k++) {
            if (target.charAt(k) != "SOS".charAt(k)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        Assert.assertEquals(marsExploration("SOSSPSSQSSOR"), 3);
        Assert.assertEquals(marsExploration("SOSSOSSOS"), 0);
        Assert.assertEquals(marsExploration("SOSSOT"), 1);
    }
}
