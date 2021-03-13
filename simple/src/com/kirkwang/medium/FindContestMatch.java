package com.kirkwang.medium;/*
 * 3/26/19 9:04 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://www.cnblogs.com/lightwindy/p/9617310.html
 */

import java.util.ArrayList;
import java.util.List;

class FindContestMatch {

    public static void main(String[] args) {
        FindContestMatch fcm = new FindContestMatch();

        System.out.println(fcm.FindContestMatch(8));
    }


    public String findContestMatch(int n) {
        List<String> matches = new ArrayList<>();
        for (int i = 1; i <= n; i++) matches.add(String.valueOf(i));

        while (matches.size() != 1) {
            List<String> newRound = new ArrayList<>();
            for (int i = 0; i < matches.size() / 2; i++)
                newRound.add("(" + matches.get(i) + "," + matches.get(matches.size() - i - 1) + ")");
            matches = newRound;
        }
        return matches.get(0);
    }


    public String FindContestMatch(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = String.valueOf((i + 1));

        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (left < right) {
                arr[left] = "(" + arr[left] + "," + arr[right] + ")";
                left++;
                right--;
            }
            left = 0;
        }

        return arr[0];

    }
}