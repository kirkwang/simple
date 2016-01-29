package com.kirkwang.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/26/15.
 */
/*
Problem Description:

You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.

For example, given s = "++++", after one move, it may become one of the following states:

[
  "--++",
  "+--+",
  "++--"
]


If there is no valid move, return an empty list [].
 */
public class FlipGame {
    public static void main(String[] args) {
        FlipGame fg = new FlipGame();
        String fgame = "--++--+-+-+++";
        List steps = fg.flipGame(fgame);
        for (int i = 0; i < steps.size(); i++) {
            System.out.println(steps.get(i));
        }
    }

    public List<String> flipGame(String source) {
        List<String> moves = new ArrayList();
        if (source == null || source.length() == 0) {
            return moves;
        }
        for (int i = 0; i < source.length()-1; i++) {
            if (source.charAt(i) == '+' && source.charAt(i + 1) == '+') {
                String s1 = source.substring(0, i);
                String s2 = "--";
                String s3 = source.substring(i + 2);
                moves.add(s1 + s2 + s3);
            }
        }
        return moves;
    }
}
