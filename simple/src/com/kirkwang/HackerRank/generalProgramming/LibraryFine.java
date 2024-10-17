/*
 * 4/23/19 10:18 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/library-fine/problem
 */
public class LibraryFine {

    public static void main(String[] args) {

        int returnDay = 9;
        int returnMonth = 6;
        int returnYear = 2015;
        int dueDay = 6;
        int dueMonth = 6;
        int dueYear = 2015;

        Assert.assertEquals(libraryFine(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear), 45);
        Assert.assertEquals(libraryFine(1, 1, 2015, 31, 12, 2014), 1000);
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 1000;
        } else if (y1 == y2 && m1 > m2) {
            return 500 * (m1 - m2);
        } else if (y1 == y2 && m1 == m2 && d1 > d2) {
            return 15 * (d1 - d2);
        }
        return 0;
    }


}
