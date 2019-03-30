package com.kirkwang.Codility;

/**
 * Created by kewang on 11/15/17.
 *
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 *
 * For example, given S = "(()(())())", the function should return 1 and given S = "())", the
 * function should return 0, as explained above.
 */
public class Nesting {

  private static int Nesting(String input) {
    java.util.Stack<Character> stack = new java.util.Stack<>();
    for (int i = 0; i < input.length(); i++) {
      if (stack.empty()) {
        stack.push(input.charAt(i));
      } else {
        if (compare(stack.peek(), input.charAt(i))) {
          stack.pop();
        } else {
          stack.push(input.charAt(i));
        }

      }
    }
    return stack.isEmpty() ? 1 : 0;
  }

  private static boolean compare(Character left, char right) {

    return left.equals('(') && right == ')';

  }

  public static void main(String[] args) {
    String s = "(()(())())";
    //  s = "asdf";
    s = "()()";
    System.out.println(Nesting(s));
  }

}
