package com.kirkwang.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/23/17.
 * <p>
 * https://leetcode.com/problems/count-and-say/description/
 * <p>
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * <p>
 * 2.     11
 * <p>
 * 3.     21
 * <p>
 * 4.     1211
 * <p>
 * 5.     111221
 * <p>
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read off as "one 2, then
 * one 1" or 1211.
 * <p>
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: 1 Output: "1"
 * <p>
 * Example 2:
 * <p>
 * Input: 4 Output: "1211"
 */

public class CountAndSay {

    public static List CountAndSay(int[] input) {

        int counter = 1;
        List list = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {

            if (input[i - 1] == input[i]) {
                counter++;
            } else {
                list.add(counter);
                list.add(input[i - 1]);
                counter = 1;
            }

        }
        list.add(counter);
        list.add(input[input.length - 1]);
        return list;
    }

    public static void main(String[] args) {
        System.out.print(CountAndSay(new int[]{1, 1, 1, 2}));
    }


}
