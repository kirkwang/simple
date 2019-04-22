/*
 * 4/22/19 12:01 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

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
            System.out.println(findUnorderedAnagramPairNum(S));
        }

        in.close();
    }

    static int findUnorderedAnagramPairNum(String str) {
        Map<String, Integer> key2count = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String key = generateKey(str.substring(i, j));
                if (!key2count.containsKey(key)) {
                    key2count.put(key, 0);
                }
                key2count.put(key, key2count.get(key) + 1);
            }
        }
        return key2count.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
    }

    static String generateKey(String str) {
        return str.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining());
    }
}
