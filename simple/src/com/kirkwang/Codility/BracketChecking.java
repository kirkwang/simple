package com.kirkwang.Codility;

import org.testng.Assert;

import java.util.Stack;

/*
https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

 */
public class BracketChecking {

    public static int matching(String input) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (myStack.isEmpty()) {
                myStack.push(input.charAt(i));
            } else {
                Character left = myStack.peek();
                if (compare(left, input.charAt(i))) {
                    myStack.pop();
                } else {
                    myStack.push(input.charAt(i));
                }
            }
        }
        return myStack.isEmpty() ? 1 : 0;
    }

    public static boolean compare(char left, char right) {
        switch (left) {
            case '{':
                return right == '}';
            case '(':
                return right == ')';
            case '[':
                return right == ']';
            default:
                return false;

        }

    }

    public static void main(String[] args) {

        Assert.assertEquals(matching("{[()()]}"), 1);
        Assert.assertEquals(matching("([)()]"), 0);
    }
}
