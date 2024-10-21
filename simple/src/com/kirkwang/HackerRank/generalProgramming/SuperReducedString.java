/*
 * 4/27/19 8:51 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.Stack;

/*
https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducedString {

    public static void main(String[] args) {

        String input = "aaabccddd"; //aaabccddd > abd, baab → bb → Empty String

        Assert.assertEquals("abd", superReducedStringStack(input));
        Assert.assertEquals(superReducedStringStackv2(input), "abd");

    }

    static String superReducedStringStackv2(String s) {
        if (s.isEmpty()) {
            return "Empty String";
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stack.isEmpty()) {
                stack.push(aChar);
            } else {
                if (stack.peek() == aChar) {
                    stack.pop();
                } else {
                    stack.push(aChar);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();

    }

    static String superReducedStringStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return stack.isEmpty() ? "Empty String" : sb.toString();
    }




}
