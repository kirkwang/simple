package com.kirkwang.HackerRank;

public class LongestUniqueSubsttr {
    static boolean isVisited(String input, int i, int j) {
        boolean[] visited = new boolean[26];
        for (int k = i; k <= j; k++) {
            if (visited[input.charAt(k) - 'a'] == true) {
                return false;
            }
            visited[input.charAt(k) - 'a'] = true;
        }
        return true;
    }

    static int longestUniqueSubsttr(String input) {
        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                if (isVisited(input, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);

        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);
    }
}
