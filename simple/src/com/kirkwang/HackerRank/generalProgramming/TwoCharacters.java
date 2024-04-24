/*
 * 4/26/19 9:50 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
/*
https://www.hackerrank.com/challenges/three-month-preparation-kit-two-characters/problem
 */
public class TwoCharacters {
    static int alternate(String s) {
        Set<Integer> letters = s.chars().collect(HashSet::new, Set::add, Set::addAll);
        int maxLength = 0;
        for (int letter1 : letters) {
            for (int letter2 : letters) {
//                if (letter2 == letter1) {
//                    continue;
//                }

                List<Integer> remains = s.chars().filter(ch -> ch == letter1 || ch == letter2).collect(ArrayList::new,
                        List::add, List::addAll);

                if (IntStream.range(0, remains.size())
                        .allMatch(i -> remains.get(i) == (i % 2 == 0 ? letter1 : letter2))) {
                    maxLength = Math.max(maxLength, remains.size());
                }
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String beabeefeab = "beabeefeab";

        int ml = alternate(beabeefeab);
        System.out.println(ml);
    }

}
