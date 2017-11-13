package com.kirkwang.easy;

/**
 * Created by kewang on 12/23/15.
 */
/*
You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

Show Hint

 */
public class CanWinNim {
    public static void main(String[] args) {

        CanWinNim canwin = new CanWinNim();
        System.out.print(canwin.canWinNim(13));
    }

    public boolean canWinNim(int n) {
        if (n % 4 == 0) // if it can't be divided by 4, then true
            return false;
        else
            return true;
    }

}
