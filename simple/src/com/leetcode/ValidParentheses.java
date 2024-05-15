package com.leetcode;

import java.util.LinkedList;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String input = "(]";
        //String input = "([){]}";

        System.out.println(vp.isValid_linkedList("isValid_linkedList" + input));

    }

    public boolean isValid_linkedList(String s) {
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
