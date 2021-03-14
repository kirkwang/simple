package com.leetcode;

public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {

        int s_pointer = 0;
        if (s.length() == 0) return true;
        int t_pointer = 0;

        while (t_pointer < t.length()) {

            if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                s_pointer++;
            }
            if (s_pointer == s.length()) {
                return true;
            }
            t_pointer++;
        }
        return false;

    }

    public static void main(String[] args) {

        String source = "abc";
        String target = "ahbgdc";

        //     String source = "axc", target = "ahbgdc";
        System.out.println("The result is " + Is_Subsequence.isSubsequence(source, target));
    }

}
