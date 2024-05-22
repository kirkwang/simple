package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/string-compression/">...</a>
 * Example 1:
 * <p>
 * Input: chars = ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 * Example 2:
 * <p>
 * Input: chars = ["a"]
 * Output: Return 1, and the first character of the input array should be: ["a"]
 * Explanation: The only group is "a", which remains uncompressed since it's a single character.
 * Example 3:
 * <p>
 * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */
public class StringCompress {
    public static void main(String[] args) {
        Object[] result;
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        //["a","2","b","2","c","3"]
        result = compress(chars);
        for (Object o : result) {
            System.out.println(o);
        }
        result = compress(new char[]{'a'});
        for (Object o : result) {
            System.out.println(o);
        }

    }

    public static Object[] compress(char[] chars) {
        int counter = 1;
        List<String> list = new ArrayList<>();

        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i - 1] == chars[i]) {
                counter++;
            } else {
                list.add(String.valueOf(chars[i - 1]));
                list.add(String.valueOf(counter));
                counter = 1;
            }
        }
        list.add(String.valueOf(chars[chars.length - 1]));
        list.add(String.valueOf(counter + 1));
        return list.toArray();
    }
}
