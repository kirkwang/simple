package com.leetcode.easy;

import java.util.HashSet;

/**
 * Created by kewang on 12/26/15.
 */
/*
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

 */
public class IsValidSudoku {
    public static void main(String[] args) {
        IsValidSudoku isValidsdu = new IsValidSudoku();
        char[][] board = new char[][]{
                new char[]{'1', '2', '.'},
                new char[]{'2', '.', '1'},
                new char[]{'.', '1', '2'}
        };

        System.out.println(isValidsdu.isValidSudoku(board));
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" board " + board[i][j]);
            }
            System.out.println();
        }

    }

    public boolean isValidSudoku(char[][] board) {
        int x = board.length;
        int y = board[0].length;
        int i, j;
        for (i = 0; i < x; i++) {
            HashSet col = new HashSet<>();
            for (j = 0; j < y; j++) {
                char t = board[i][j];
                if (t != '.') {
                    if (col.contains(t)) {
                        return false;
                    }
                    col.add(t);
                }
            }
        }
        for (j = 0; j < y; j++) {
            HashSet row = new HashSet<>();
            for (i = 0; i < x; i++) {
                char t = board[i][j];
                if (t != '.') {
                    if (row.contains(t)) {
                        return false;
                    }
                    row.add(t);
                }
            }
        }
        for (i = 0; i < x; i += 3) {
            for (j = 0; j < y; j += 3) {
                HashSet section = new HashSet();
                for (int block = 0; block < 9; block++) {
                    int xo = block % 3;
                    int yo = block / 3;
                    char c = board[i + xo][j + yo];
                    if (c != '.') {
                        if (section.contains(c))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
