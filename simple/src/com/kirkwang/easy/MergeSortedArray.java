package com.kirkwang.easy;

/**
 * Created by kewang on 12/25/15.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();

        int[] one = new int[]{1, 3, 5};
        int[] two = new int[]{1, 2, 2, 2, 10};
        int[] merged = msa.mergeSortedArray(one, two);
        for (int aMerged : merged) {
            System.out.print(aMerged + " ");
        }
    }

    public int[] mergeSortedArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int pa = 0;
        int pb = 0;
        int index = 0;
        //abc has more
        // List abc = Arrays.asList(result);

        while (pa < a.length && pb < b.length) {
            if (a[pa] < b[pb]) {
                result[index++] = a[pa++];
            } else {
                result[index++] = b[pb++];
            }
        }
        while (pa < a.length) {
            result[index++] = a[pa++];
        }
        while (pb < b.length) {
            result[index++] = b[pb++];
        }

        return result;
    }
}
