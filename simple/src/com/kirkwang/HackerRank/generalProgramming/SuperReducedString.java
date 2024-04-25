/*
 * 4/27/19 8:51 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.*;
import java.util.stream.Collectors;

/*
https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducedString {

    public static void main(String[] args) {

        String input = "aaabccddd"; //aaabccddd > abd, baab → bb → Empty String
        System.out.println(superReducedStringStack(input));

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
        return stack.isEmpty() ? "Empty String" : stack.stream().map(i -> i.toString()).collect(Collectors.joining());
    }

    static String superReducedStringStack(String s) {
        Stack<Character> stack = new Stack<>();
        String result;
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
        return stack.isEmpty() ? "Empty String" : stack.stream().map(i -> i.toString()).collect(Collectors.joining());
    }
    public static String superReducedString_v2(String input) {

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
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.isEmpty() ? "Empty String" : (String) set.stream().map(i -> i.toString()).collect(Collectors.joining());
    }
}
