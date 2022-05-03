package com.kirkwang.easy;

import java.io.IOException;

/**
 * Created by amp on 9/24/2015.
 */
public class ReverseString {

  public static String ReverseString(String input) {
    if (input == null || input.length() == 0) {
      return input;
    }
    char[] reversed = input.toCharArray();
    for (int i = 0; i < input.length() / 2; i++) {
      char temp = reversed[i];
      reversed[i] = reversed[input.length() - i - 1];
      reversed[input.length() - i - 1] = temp;
    }

    return String.valueOf(reversed);
  }

  public static void main(String[] args) throws IOException {

    //original string
    String str = "Sony is going to introduce Internet TV soon";
    System.out.println("Original String: " + str);

    System.out.println("Reservsed String: " + ReverseString(str));


  }

}



