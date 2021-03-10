package com.kirkwang.Codility;

/**
 * Created by kewang on 11/15/17.
 *
 * <p>https://codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 *
 * <p>that, given a string S consisting of N characters, returns 1 if S is properly nested and 0
 * otherwise.
 *
 * <p>For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the
 * function should return 0, as explained above.
 */
public class Brackets {

    public static int matching(String S) {
        java.util.Stack<Character> bracket = new java.util.Stack();
        for (int i = 0; i < S.length(); i++) {
            if (bracket.empty()) {
                bracket.push(S.charAt(i));
            } else {
                Character left = bracket.peek();
                if (compare(left, S.charAt(i))) {
                    bracket.pop(); // remove matching pair
                } else {
                    bracket.push(S.charAt(i));
                }
            }
        }
        return bracket.isEmpty() ? 1 : 0;
    }

    private static boolean compare(char left, Character right) {
        switch (left) {
            case '{':
                return right == '}';
            case '[':
                return right.equals(']');

            case '(':
                return right.equals(')');

            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String s = "{[]{()()}}";
        s = "asdf";
        s = "{[()(";
        System.out.println(matching(s));
    }
}
