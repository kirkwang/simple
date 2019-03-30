package com.kirkwang.medium;/*
 * 3/26/19 9:04 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://www.cnblogs.com/lightwindy/p/9617310.html
 */

class FindContestMatch {

    public static void main(String[] args) {
        FindContestMatch fcm = new FindContestMatch();

        System.out.println(fcm.FindContestMatch(3));
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