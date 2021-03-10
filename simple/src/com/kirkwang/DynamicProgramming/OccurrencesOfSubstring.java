package com.kirkwang.DynamicProgramming;

/**
 * Created by kewang on 11/28/17.
 *
 * <p>https://stackoverflow.com/questions/767759/occurrences-of-substring-in-a-string
 */
public class OccurrencesOfSubstring {

    public static int findCatDog(String input, String target) {
        int counter = 0;

        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = input.indexOf(target, lastIndex);
            if (lastIndex != -1) {
                counter++;
                lastIndex = lastIndex + target.length();
            }
        }

        return counter;
    }

    public static boolean matchingCount(String first, String second, String input) {

        int firstCount = findCatDog(input, first);
        int secondCount = findCatDog(input, second);

        return firstCount == secondCount;
    }

    public static void main(String[] args) {

        int[] m = new int[]{1, 3, 7, 9, 9};
        int[] n = new int[]{5, 6, 8, 9, 10};
        String equal1 = "equal";
        String equal2 = "Equal";
        String equal3 = "Equal";

        System.out.println("two string comparesion with equals " + equal1.equals(equal2));
        System.out.println(
                "two string comparesion with ignore case equals " + equal1.equalsIgnoreCase(equal2));
        System.out.println("two string comparesion with NEW string " + equal2.equals(equal3));
        System.out.println("two string comparesion with == string " + equal2 == equal3);
        System.out.println("two string comparesion with subString of 2 eq ual " + equal1.substring(2));
        System.out.println("two string comparesion with compareTo  " + equal1.compareTo("equal"));
        System.out.println("two string comparesion with compareTo  " + equal1.compareTo("fqubl"));
        System.out.println("two string comparesion with compareTo  " + equal1.split("u")[0]);
        System.out.println("two string comparesion with endsWith  " + equal1.endsWith("al"));
        System.out.println("two string comparesion with chars  " + equal1.toCharArray()[0]);
        System.out.println(
                matchingCount("cat", "dog", "atdogcatcatdog")); // find how many cat(s) in the target string
    }
}
