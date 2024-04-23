/*
 * 4/23/19 10:18 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.time.LocalDate;
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
        System.out.println(libraryFine(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear));
    }

    static LocalDate toLocalDate(int d, int m, int y) {
        return LocalDate.of(y, m, d);
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine;
        LocalDate actual = toLocalDate(d1, m1, y1);
        LocalDate due = toLocalDate(d2, m2, y2);

        if (actual.isEqual(due) || actual.isBefore(due)) {
            fine = 0;
        } else if (actual.getMonth() == due.getMonth() && actual.getYear() == due.getYear()) {
            fine = 15 * (actual.getDayOfMonth() - due.getDayOfMonth());
        } else if (actual.getYear() == due.getYear()) {
            fine = 500 * (actual.getMonthValue() - due.getMonthValue());
        } else {
            fine = 1000;
        }


        return fine;
    }
}
