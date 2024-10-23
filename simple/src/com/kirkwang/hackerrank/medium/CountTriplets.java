package com.kirkwang.hackerrank.medium;
/*
 * 3/27/19 6:14 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
Sample Input 1
6 3
1 3 9 9 27 81

Sample Output 1
6
Explanation 1

The triplets satisfying are index , , , ,  and .
 */
class CountTriplets {

    private final List<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        CountTriplets frp = new CountTriplets();

        // Integer[] array = new Integer[]{1, 3, 9, 9, 27, 81};
        Integer[] array = new Integer[]{1, 5, 5, 25, 125};

        ArrayList<Long> arrayList = new ArrayList<>();
        for (Integer i : array) {
            arrayList.add(Long.valueOf(i));
        }

        long result = frp.countTriplets(arrayList, 5);

        System.out.println(result);
    }

    static long countTriplets(List<Long> arr, long r) {
        /*
        This method doesn't work.
        There is another way, r/2, r , r*2 , using r to walk the loop, <-rLeft and r , rRight->
         */
        ArrayList result = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            long first = arr.get(i);
            long second = r * first;
            long third = r * second;
            Boolean flag = checkOthertwo(arr, second, third);
            if (flag) {

                result.add(arr.indexOf(first));
                result.add(arr.indexOf(second));
                result.add(arr.indexOf(third));
            }

        }
        System.out.println(Long.valueOf(result.size()));
        return Long.valueOf(result.size() / 3);
    }

    static boolean checkOthertwo(List<Long> arr, long second, long third) {
        //arr.subList(from, to);
        return arr.contains(second) && arr.contains(third) ? true : false;
    }

}