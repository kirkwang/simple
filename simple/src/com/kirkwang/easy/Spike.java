
/*
 * 3/24/19 5:54 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
package com.kirkwang.easy;

class Spike {
    public
    static int findSpike(int[] input) {

        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] > input[i]) {
                return input[i - 1];

            }
        }
        return input[input.length - 1];
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 8, 9, 10};
        System.out.println(findSpike(input));
    }
}