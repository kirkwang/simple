/*
 * 4/27/19 8:00 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        String input = "0100101010";
        String input1 = "0100101010";
        String input2 = "01100";

        System.out.println(beautifulBinaryString(input2));
    }

    static int beautifulBinaryString(String b) {
        char[] sb = b.toCharArray();
        int count = 0;
        for (int i = 2; i < sb.length; i++) {
            if (sb[i - 2] == '0' && sb[i - 1] == '1' && sb[i] == '0') {
                sb[i] = '1';
                count++;
            }
        }
        return count;
    }
}
