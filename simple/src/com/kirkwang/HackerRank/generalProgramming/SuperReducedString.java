/*
 * 4/27/19 8:51 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.*;

/*
https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducedString {

    public static void main(String[] args) {

        String input = "aaabccddd"; //aaabccddd > abd, baab → bb → Empty String

        Assert.assertEquals("abd", superReducedStringStack(input));
        Assert.assertEquals("abd", superReducedStringStackv2(input));

    }

    static String superReducedStringStackv2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return stack.isEmpty() ? "Empty String" : sb.toString();

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

    public static String superReducedString_v2(String input) {
        // fail on some test cases
        HashMap<Character, Integer> mMap = new HashMap<>();
        for (Character i : input.toCharArray()) {
            mMap.put(i, mMap.getOrDefault(i, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : mMap.entrySet()) {

            if (entry.getValue() % 2 > 0) {
                sb.append(entry.getKey());
            }
        }

        return sb.length() == 0 ? "Empty String" : sb.toString();
    }

    static String superReducedStringSet(String s) {
        // fail on some test cases
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return set.isEmpty() ? "" : sb.toString();

    }
}
