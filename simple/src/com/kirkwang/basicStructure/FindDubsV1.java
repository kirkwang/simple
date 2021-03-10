package com.kirkwang.basicStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDubsV1 {
    public static Set fd(List<String> input) {
        if (input == null) {
            return new HashSet();
        }
        Set unique = new HashSet();
        Set dup = new HashSet();

        for (Object temp : input) {
            if (unique.add(temp)) {
                System.out.println("unique found " + temp);
            } else {
                dup.add(temp);
                System.out.println("dup found " + temp);

            }

        }
        return unique;
    }

    public static void main(String[] args) {
        String[] input = {"a", "aa", "ab", "abc", "a"};
        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        FindDubsV1.fd(Arrays.asList(input));

    }
}
