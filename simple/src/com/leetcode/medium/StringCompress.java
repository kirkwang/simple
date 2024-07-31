package com.leetcode.medium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
https://leetcode.com/problems/string-compression/description/
Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".

 */
public class StringCompress {
    public static void main(String[] args) {
        List<String> result;
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] expected = {'a', '2', 'b', '2', 'c', '3'};
        result = compresser(chars);


        Assert.assertEquals(result.size(), 6);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(result.get(i), String.valueOf(expected[i]));
        }

        Assert.assertEquals(compress(new char[]{'a'}), 1);

        Assert.assertEquals(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}), 4);

    }

    public static int compress(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {

                sb.append(set.getKey());
            } else {
                sb.append(set.getKey());
                sb.append(set.getValue());
            }
        }
        return sb.length();
    }

    public static List<String> compresser(char[] chars) {
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
        return list;
    }
}
