package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kewang on 12/14/17.
 *
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 *
 *
 * Input:Digit string "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinationsPhoneNumber {

  public static List<String> LetterCombinationsPhoneNumber(String digits) {
    LinkedList<String> linkedList = new LinkedList();
    String[] keyPad = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
        "wxyz"};
    if (digits == null || digits.length() == 0) {
      return linkedList;
    }
    linkedList.add("");
    for (int i = 0; i < digits.length(); i++) {
      int digit = Character.getNumericValue(digits.charAt(i));

      while (linkedList.peek().length() == i) {

        String x = linkedList.remove(); //dequeue from the front
        for (char s : keyPad[digit].toCharArray()) {
          //append s after dequeued item . so the previous version were removed
          linkedList.add(x + s);
        }

      }
    }
    return linkedList;
  }

  public static void main(String[] args) {

    System.out.println("This is the result " + LetterCombinationsPhoneNumber("245"));

  }

}
