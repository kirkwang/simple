package com.leetcode.easy;

import java.util.*;

/**
 * Created by amp on 9/21/2015.
 */
public class Capture {
    static <T> Set<T> listToSet(List<T> list) {
        Set<T> set = new HashSet<T>();
        set.addAll(list);
        return set;
    }

    public static void main(String[] args) {
        List<?> list = new ArrayList<Date>();
        Set<?> set = listToSet(list);

    }

}

