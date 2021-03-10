package com.kirkwang.Codility;

import java.util.Stack;

public class BracketChecking {

    public static int matching(String input) {
        Stack<Character> myStack = new Stack();
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

        String s = "{[]{()()}}";
        s = "{[()()]}";
        //s = "{[()(";
        System.out.println(matching(s));
    }
}
