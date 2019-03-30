package com.kirkwang.medium;


/*
 * 3/27/19 3:10 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

import java.util.Arrays;
import java.util.LinkedList;

class RevealCardsInIncreasingOrder {

    public static void main(String[] args) {
        RevealCardsInIncreasingOrder revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
        int[] deck = new int[]{17, 13, 11, 2, 3, 5, 7};

        int[] ans = revealCardsInIncreasingOrder.deckRevealedIncreasing(deck);
        for (int i : ans) {
            System.out.println(" deck output" + i);
        }
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        LinkedList<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);

        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card : deck) {
            ans[index.pollFirst()] = card;
            if (!index.isEmpty())
                index.add(index.pollFirst());
        }

        return ans;
    }
}