package com.kirkwang.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/23/17.
 *
 * https://leetcode.com/problems/count-and-say/description/
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 *
 * 2.     11
 *
 * 3.     21
 *
 * 4.     1211
 *
 * 5.     111221
 *
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read off as "one 2, then
 * one 1" or 1211.
 *
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *
 * Input: 1 Output: "1"
 *
 * Example 2:
 *
 * Input: 4 Output: "1211"
 */
@Deprecated // not coded yet
public class CountAndSay {

  public static List CountAndSay(int[] input) {
    int tail = 0;
    int counter = 1;
    List list = new ArrayList<>();
    for (int i = 0; i < input.length; i++) {

      if (input[i] == input[i - 1]) {
        counter++;
      } else {
        list.add(counter);
        list.add(input[i + 1]);
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
