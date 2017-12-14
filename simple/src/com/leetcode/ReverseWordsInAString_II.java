package com.leetcode;

/**
 * Created by kewang on 12/14/17.
 */
public class ReverseWordsInAString_II {

  public static String ReverseWordsInAString_II(String input) {
    if (input == null) {
      return input;
    }
    char[] processed = input.trim().toCharArray();
    int j = processed.length - 1;
    for (int i = 0; i < processed.length / 2; i++) {
      char c = processed[i];
      processed[i] = processed[j - i];
      processed[j - i] = c;
    }

    int head = 0;
    int tail = 0;
    for (int i = 0; i < processed.length; i++) {

      char endChar = processed[tail];
      while (!Character.isSpaceChar(endChar)) {
        if (tail < processed.length) {
          endChar = processed[tail];
          tail++;
        } else {
          break;
        }


      }
      reverse(processed, head, tail - 2);
      head = tail;
      i = tail;

    }
    //if (Character.isLetter(ch))

    // String[] strings = processed.split(":");
    // processed.join(" ", strings);
    return String.valueOf(processed);
  }

  private static char[] reverse(char[] processed, int i, int j) {
    if (processed == null || i < 0 || j < 0) {

      return processed;
    }
    while (i <= j) {
      char temp = processed[i];
      processed[i] = processed[j];
      processed[j] = temp;
      i++;
      j--;
    }
    return processed;
  }


  public static void main(String args[]) {

    //original string
    String str = " Sony is going to introduce Internet TV soon ";
    System.out.println("Original String: " + str);

    System.out.println("Reservsed String: " + ReverseWordsInAString_II(str));


  }


}
