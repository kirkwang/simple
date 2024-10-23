/*
 * 4/27/19 1:35 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
https://www.hackerrank.com/challenges/gem-stones/problem
 */
public class Gemstones {

    public static void main(String[] args) {
        Assert.assertEquals(gemstonesBit(new String[]{"abcdde", "baccd", "eeabg"}), 2);

        Assert.assertEquals(gemstones_v1(new String[]{"abc", "bac", "bc"}), 2);
    }

    static int gemstonesBit(String[] array) {
        final int NUM_ELEMENTS = 26;
        BitSet bitset = new BitSet(NUM_ELEMENTS);
        bitset.set(0, NUM_ELEMENTS);

        /* Create a BitSet for each rock. "AND" it with our original BitSet */
        for (String rock : array) {
            BitSet currBitSet = new BitSet(NUM_ELEMENTS);
            for (int i = 0; i < rock.length(); i++) {
                currBitSet.set(rock.charAt(i) - 'a');
            }
            bitset.and(currBitSet);
        }

        return bitset.cardinality();
    }

    static int gemstones_v1(String[] arr) {
        Set set = null;

        for (String temp : arr) {
            Set set1 = temp.chars().collect(HashSet::new, HashSet::add, HashSet::addAll);
            if (set == null) {
                set = set1;
            } else {
                set.retainAll(set1);
            }
        }
        return Objects.requireNonNull(set).size();
    }

}
