/*
 * 5/17/19 8:58 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

class GFG {

    static final int N = 4;
    static List<String> dictionary = new ArrayList() {
        {
            add("PINS");
            add("PINES");
            add("DATES");
            add("PINT");
            add("TEPEE");
        }
    };
    static boolean[][] tracer = new boolean[N][N];


    // A recursive function to print all words present on findWord
    static void findWordsUtil(char[][] board, boolean[][] visited, int i,
                              int j, String str) {
        // Mark current cell as tracer and append current character
        // to str
        visited[i][j] = true;
        str += board[i][j];

        // If str is present in dictionary, then print it
        if (dictionary.contains(str)) {
            System.out.println(str);
        }
        // Traverse 8 adjacent cells of findWord[i][j]
        int top = i - 1;
        int bottom = i + 1;
        int left = j - 1;
        int right = j + 1;

        for (int row = top; row <= bottom && row < N; row++)
            for (int col = left; col <= right && col < N; col++)
                if (row >= 0 && col >= 0 && !visited[row][col]) {
                    findWordsUtil(board, visited, row, col, str);
                }
        // Erase current character from string and mark tracer
        // of current cell as false
        str = "" + str.charAt(str.length() - 1);
        visited[i][j] = false;
    }

    // Prints all words present in dictionary.
    static void findWords(char[][] board) {
        String str = "";

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                findWordsUtil(board, tracer, i, j, str);
    }

    // Driver program to test above function
    public static void main(String[] args) {
        char[][] boardOfLetters = {
                {'A', 'T', 'E', 'E'},
                {'A', 'P', 'Y', 'O'},
                {'T', 'I', 'N', 'U'},
                {'E', 'D', 'S', 'E'}
        };

        System.out.println("Following words of dictionary are present");
        findWords(boardOfLetters);

    }
}

