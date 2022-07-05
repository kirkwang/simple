/*
 * 5/18/19 8:57 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Boogle {

    private static ArrayList dictionary;

    static {
        dictionary = new ArrayList() {
            {
                add("PINS");
                add("PINES");
                add("DATES");
                add("PINT");
                add("TEPEE");
            }
        };
    }

    public static void main(String[] args) {

        char[][] board = {
                {'A', 'T', 'E', 'E'},
                {'A', 'P', 'Y', 'O'},
                {'T', 'I', 'N', 'U'},
                {'E', 'D', 'S', 'E'}
        };

        Set<String> result = findWord(board);
        System.out.println(result);

        AssertJUnit.assertTrue("Valid PINS ", result.contains("PINS"));
        AssertJUnit.assertTrue("Valid PINES ", result.contains("PINES"));


        AssertJUnit.assertFalse("DATES cells not adjacent", result.contains("DATES"));
        AssertJUnit.assertFalse("Path not sequential", result.contains("PINT"));
        AssertJUnit.assertFalse("Cell used more than once", result.contains("TEPEE"));
        AssertJUnit.assertFalse("Word not in the dictionary", result.contains("SID"));
        AssertJUnit.assertFalse("Word not in the dictionary", result.contains("1"));
        AssertJUnit.assertFalse("Word not in the dictionary", result.contains("A A"));
        AssertJUnit.assertFalse("Word not in the dictionary", result.contains("S I D"));

        String ETAATE = "ETAATE";
        dictionary.add(ETAATE);
        result = findWord(board);
        AssertJUnit.assertTrue("Palindrom case, ETAATE ", result.contains(ETAATE));
        System.out.println(result);

    }

    public static Set<String> findWord(char[][] board) {
        Set<String> result = new HashSet<>();
        int boardHight = board.length;
        int boardWidth = board[0].length;

        boolean[][] history = new boolean[boardHight][boardWidth];

        for (int i = 0; i < boardHight; i++) {
            for (int j = 0; j < boardWidth; j++) {
                findWord(history, board, i, j, "", result);
            }
        }
        return result;
    }

    private static void findWord(boolean[][] history, char[][] board, int row, int col, String word, Set<String> result) {
        history[row][col] = true;
        word += board[row][col];

        if (dictionary.contains(word)) {
            result.add(word);
        }

        int top = row - 1;
        if (top >= 0 && !history[top][col]) {
            findWord(history, board, top, col, word, result);
        }

        int bottom = row + 1;
        if (bottom < board.length && !history[bottom][col]) {
            findWord(history, board, bottom, col, word, result);
        }

        int left = col - 1;
        if (left >= 0 && !history[row][left]) {
            findWord(history, board, row, left, word, result);
        }

        int right = col + 1;
        if (right < board[0].length && !history[row][right]) {
            findWord(history, board, row, right, word, result);
        }

        if (top >= 0 && left >= 0 && !history[top][left]) {
            findWord(history, board, top, left, word, result);
        }

        if (top >= 0 && right < board[0].length && !history[top][right]) {
            findWord(history, board, top, right, word, result);
        }
        if (bottom < board.length && left >= 0 && !history[bottom][left]) {
            findWord(history, board, bottom, left, word, result);
        }

        if (bottom < board.length && right < board[0].length && !history[bottom][right]) {
            findWord(history, board, bottom, right, word, result);
        }
        history[row][col] = false;
    }
}
