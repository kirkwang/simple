package com.leetcode.medium;


/*
 * 3/27/19 3:10 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
/*
https://leetcode.com/problems/reveal-cards-in-increasing-order/description/
Example 1:

Input: deck = [17,13,11,2,3,5,7]
Output: [2,13,3,11,5,17,7]
Explanation:
We get the deck in the order [17,13,11,2,3,5,7] (this order does not matter), and reorder it.
After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
We reveal 2, and move 13 to the bottom.  The deck is now [3,11,5,17,7,13].
We reveal 3, and move 11 to the bottom.  The deck is now [5,17,7,13,11].
We reveal 5, and move 17 to the bottom.  The deck is now [7,13,11,17].
We reveal 7, and move 13 to the bottom.  The deck is now [11,17,13].
We reveal 11, and move 17 to the bottom.  The deck is now [13,17].
We reveal 13, and move 17 to the bottom.  The deck is now [17].
We reveal 17.
Since all the cards revealed are in increasing order, the answer is correct.
Example 2:

Input: deck = [1,1000]
Output: [1,1000]

 */

import java.util.Arrays;
import java.util.LinkedList;

class RevealCardsInIncreasingOrder {

    public static void main(String[] args) {
        RevealCardsInIncreasingOrder revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
        int[] deck = new int[]{17, 13, 11, 2, 3, 5, 7};

        int[] ans = revealCardsInIncreasingOrder.deckRevealedIncreasing(deck);
        for (int i : ans) {
            System.out.println(" deck output " + i);
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