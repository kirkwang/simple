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
        LinkedList<Integer> index = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            //index has the INDEX
            index.add(i);
        }
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        for (int i = 0; i < deck.length; i++) {
            //the deck[i] card is going to into ans location with index from the list
            ans[index.pollFirst()] = deck[i];
            if (!index.isEmpty()) {
                //pull the next index and put it back to the queue/linked list
                index.add(index.pollFirst());
            }
        }
        return ans;
    }
}