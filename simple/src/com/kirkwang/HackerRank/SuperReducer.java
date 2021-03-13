package com.kirkwang.HackerRank;

import java.util.Stack;

/**
 * Created by kewang on 10/31/17. Problem Statement Steve has a string, S, consisting of n lowercase
 * English alphabetic >letters. In one operation, he can delete any pair of adjacent letters with
 * same >value. For example, string "aabcc" would become either "aab" or "bcc" >after operation.
 *
 * <p>Steve wants to reduce as much as possible. To do this, he will repeat the >above operation as
 * many times as it can be performed. Help Steve out by finding >and printing S's non-reducible
 * form!
 *
 * <p>Note: If the final string is empty, print Empty String.
 *
 * <p>Input Format A single string, S.
 *
 * <p>Constraints 1≤n≤100 Output Format If the final string is empty, print Empty String; otherwise,
 * print the final >non-reducible string.
 *
 * <p>Sample Input aaabccddd
 *
 * <p>Sample Output abd
 */
public class SuperReducer {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        Stack<Character> stack = new Stack();

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
        return sb.toString();
        //return stack.isEmpty() ? "Empty String" : (String) stack.stream().map(i -> i.toString()).collect(Collectors.joining());
    }


    public static void main(String[] args) {
        String input = "aaaabccddd";

        String reduced = superReducedString(input);

        System.out.println(input + " simple input string");
        System.out.println(reduced + " reduced string");

        int index = 0;
        int len = input.length() - 1;

        while (index < len) {
            char left = input.charAt(index);
            char right = input.charAt(index + 1);
            if (left == right) {
                // index + 2 means skip  1 char
                input = input.substring(0, index) + input.substring(index + 2);
                // we need to reset to from head and length
                len = input.length() - 1;
                index = 0;
                System.out.println(input + " continue input string");
                continue;
            }
            index++;
        }
    }
}
