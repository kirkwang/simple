/*
 * 4/22/19 12:01 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Sherlock and Anagrams
https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */
public class SherlockandAnagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int tc = 0; tc < T; tc++) {
            String S = in.next();
            System.out.println(sherlockAndAnagrams(S));
        }

        in.close();
    }


    public static int sherlockAndAnagrams(String str) {
        Map<String, Integer> key2count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String key = sortStr(str.substring(i, j));
                key2count.put(key, key2count.getOrDefault(key, 0) + 1);
            }
        }

        return key2count.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
    }

    static String sortStr(String str) {
        char[] result = str.toCharArray();
        Arrays.sort(result);
        System.out.println("str : " + str + " result : " + String.valueOf(result));
        return String.valueOf(result);
    }
}
