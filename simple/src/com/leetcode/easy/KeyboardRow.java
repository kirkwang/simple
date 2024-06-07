package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
 */
public class KeyboardRow {
    public static void main(String[] args) {

        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        Assert.assertTrue(Arrays.equals(findWords(input), new String[]{"Alaska", "Dad"}));
        Assert.assertTrue(Arrays.equals(findWords(new String[]{"adsdf", "sfd"}), new String[]{"adsdf", "sfd"}));
        Assert.assertTrue(Arrays.equals(findWords(new String[]{"omk"}), new String[]{}));

    }

    public static String[] findWords(String[] words) {
        String qwertyuiop = "qwertyuiop";
        String asdfghjkl = "asdfghjkl";
        String zxcvbnm = "zxcvbnm";

        List<String> list = new ArrayList<>();
        for (String w : words) {
            int[] b = new int[3];
            char[] temp = w.toLowerCase().toCharArray();
            for (char c : temp) {
                if (qwertyuiop.indexOf(c) != -1) {
                    b[0] = 1;
                } else if (asdfghjkl.indexOf(c) != -1) {
                    b[1] = 1;
                } else if (zxcvbnm.indexOf(c) != -1) {
                    b[2] = 1;
                }
            }

            if ((b[0] + b[1] + b[2]) == 1) {
                list.add(w);
            }
        }
        String[] ss = new String[list.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = list.get(i);
        }
        return ss;
    }

}
