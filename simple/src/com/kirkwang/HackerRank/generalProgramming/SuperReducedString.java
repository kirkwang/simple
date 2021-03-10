/*
 * 4/27/19 8:51 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class SuperReducedString {

    public static void main(String[] args) {

        String input = "aaabccddd";
        System.out.println(superReducedStringStack(input));

    }

    static String superReducedStringStackv2(String s) {
        Stack<Character> stack = new Stack();
        String result;
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
        Stack<Character> stack = new Stack();
        String result;
        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
                //result = "Empty String";
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

    static String superReducedStringSet(String s) {
        Set set = new HashSet();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.isEmpty() ? "Empty String" : (String) set.stream().map(i -> i.toString()).collect(Collectors.joining());
    }
}
