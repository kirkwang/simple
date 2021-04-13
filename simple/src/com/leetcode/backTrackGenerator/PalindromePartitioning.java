package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/16/17.
 * <p>
 * https://leetcode.com/problems/palindrome-partitioning/description/
 * <p>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return all possible palindrome partitioning of s.
 * <p>
 * For example, given s = "aab", Return
 * <p>
 * [ ["aa","b"], ["a","a","b"] ]
 */
public class PalindromePartitioning {

  public static List<List<String>> PalindromePartitioning(String input) {
    List<List<String>> list = new ArrayList<>();
    if (input == null || input.length() == 0) {
      return null;
    }

    generator(list, new ArrayList<>(), input, 0);

    return list;
  }

  private static void generator(List<List<String>> list, ArrayList<String> sublist, String input,
      int index) {
    if (input.length() == index) {
      list.add(new ArrayList<>(sublist));
    } else {
      for (int i = index; i < input.length(); i++) {

        if (checkPalindrome(input, index, i)) {
          //save the Palindrome to the list. the i+1 is the next char
          sublist.add(input.substring(index, i + 1));
          // those 3 are the same list, sublist, input,
          // index is the next char.
          generator(list, sublist, input, i + 1);
          // sublist remove the last item
          sublist.remove(sublist.size() - 1);
        }
      }

    }

  }

  private static boolean checkPalindrome(String input, int i, int j) {
    while (i < j) {
      if (input.charAt(i++) != input.charAt(j--)) {
        return false;
      }
    } // this loop goes from two far ends to middle
    return true;
  }

  public static void main(String[] args) {

    System.out.println("This is the result " + PalindromePartitioning("geeks"));

  }

}
