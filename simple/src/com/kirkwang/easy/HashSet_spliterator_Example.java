package com.kirkwang.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

/**
 * Created by amp on 9/21/2015.
 */
public class HashSet_spliterator_Example {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(new Integer(1));
        set.add(new Integer(2));
        set.add(new Integer(3));
        set.spliterator();
        set.forEach(System.out::println);

        //     set.remove(new Integer(3));

        //   List<String> list = Arrays.asList("Apple", "Banana", "Orange");

        Spliterator<Integer> s = set.spliterator();
        Spliterator<Integer> s1 = s.trySplit();

        s.forEachRemaining(System.out::println);
        System.out.println("-- traversing the other half of the spliterator --- ");
        System.out.println("--  s.getExactSizeIfKnown() --- ");

        s1.forEachRemaining(System.out::println);
        if (s.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }
        if (s.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }
        if (s.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }
        if (s.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (s.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }
        if (s.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }
        if (s.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }
        if (s.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }

    }
}
