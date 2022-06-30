package com.kirkwang.easy;

/**
 * Created by kewang on 12/14/17.
 * <p>
 * https://leetcode.com/problems/reverse-words-in-a-string/description/
 * <p>
 * Reverse Words in a String
 * <p>
 * Given an input string, reverse the string word by word.
 * <p>
 * For example, Given s = "the sky is blue", return "blue is sky the".
 */
public class ReverseWordsInAString_I {

  public static String reverseWordInAString(String input) {
    if (input == null) {
      return input;
    }

    input = input.trim().replaceAll("\\s+", " ");
    String[] reversed = input.split(" ");
    for (int i = 0; i < reversed.length / 2; i++) {
      String temp = reversed[i];
      reversed[i] = reversed[reversed.length - i - 1];
      reversed[reversed.length - i - 1] = temp;
    }

    return String.join(" ", reversed);
  }

  public static void main(String[] args) {

    //original string
    String str = "Sony     is going to introduce Internet TV soon";
    System.out.println("Original String: " + str);

    System.out.println("Reservsed String: " + reverseWordInAString("   a   b "));
    System.out.println("Reservsed String: " + reverseWordInAString(str));

  }


}
