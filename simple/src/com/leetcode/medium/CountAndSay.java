package com.leetcode.medium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/23/17.
 * <p>
 * <a href="https://leetcode.com/problems/count-and-say/description/">...</a>
 * same as <a href="https://leetcode.com/problems/string-compression/description/">...</a>
 * <p>["a","a","b","b","c","c","c"]
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


    public static void main(String[] args) {

        Assert.assertEquals(countAndSay(111), "[3, 1]");
        Assert.assertEquals(countAndSay(2), "[1, 2]");
        Assert.assertEquals(countAndSay(111221), "[3, 1, 2, 2, 1, 1]");

        char[] input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        Assert.assertEquals(compress(input), "2a2b3c");
    }

    public static String countAndSay(int n) {
        List<String> list = new ArrayList<>();
        int counter = 1;
        char[] input = String.valueOf(n).toCharArray();

        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] == input[i]) {
                counter++;
            } else {
                list.add(String.valueOf(counter));
                list.add(String.valueOf(input[i - 1]));
                counter = 1;
            }
        }
        list.add(String.valueOf(counter));
        list.add(String.valueOf(input[input.length - 1]));

        return list.toString();
    }

    public static String compress(char[] chars) {

        int counter = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                counter++;
            } else {
                sb.append(counter);
                sb.append(chars[i - 1]);
                counter = 1;
            }
        }
        sb.append(counter);
        sb.append(chars[chars.length - 1]);

        return String.valueOf(sb);
    }

}
