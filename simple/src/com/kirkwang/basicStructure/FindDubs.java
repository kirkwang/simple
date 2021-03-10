package com.kirkwang.basicStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amp on 9/21/2015.
 */
public class FindDubs {

    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args) {
            if (!s.add(a)) {
                System.out.println("Dublicat detected: " + a);
            }
            System.out.println(s.size() + " distinct words: " + s);
        }

    }
}
