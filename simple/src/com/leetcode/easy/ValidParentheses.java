package com.leetcode.easy;
/*
https://leetcode.com/problems/valid-parentheses/description/
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

 */

import org.testng.Assert;

import java.util.LinkedList;

public class ValidParentheses {
    public static void main(String[] args) {


        Assert.assertTrue(isValid_linkedList("()[]{}"));
        Assert.assertFalse(isValid_linkedList("(]"));
        Assert.assertTrue(isValid_linkedList("()"));

    }

    public static boolean isValid_linkedList(String s) {
        if (s == null || s.isEmpty())
            return true;
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

}
