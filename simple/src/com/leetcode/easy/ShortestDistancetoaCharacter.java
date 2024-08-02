/*
 * 5/1/19 4:05 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/shortest-distance-to-a-character/description/
Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
Example 2:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]

 */
public class ShortestDistancetoaCharacter {

    public static void main(String[] args) {
        int[] result = shortestToChar("loveleetcode", 'e');
        Assert.assertEquals(result, new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0});
        Assert.assertEquals(shortestToChar("aaab", 'b'), new int[]{3, 2, 1, 0});
    }

    public static int[] shortestToChar(String S, char C) {

        int min;
        int[] offsetOfChar = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                if (ch == C) {
                    int dis = Math.abs(j - i);
                    min = Math.min(min, dis);
                }
            }

            offsetOfChar[i] = min;
        }
        return offsetOfChar;
    }


}
