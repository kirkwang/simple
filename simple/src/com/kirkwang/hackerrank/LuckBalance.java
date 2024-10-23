/*
 * 5/6/19 5:06 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {
        List<Integer> importantLucks = new ArrayList<>();

        //    importantLucks.add(L);
        importantLucks.sort(Collections.reverseOrder());
        for (int i = 0; i < importantLucks.size(); i++) {
            //    result += importantLucks.get(i) * (i + 1 <= K ? 1 : -1);
        }
        //   System.out.println(result);
        return k;
    }

    public static void main(String[] args) {

        int m = 3;


        int[][] arr = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};

        System.out.println(luckBalance(m, arr));
    }
}
