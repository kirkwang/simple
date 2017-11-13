package com.kirkwang.Codility;

/**
 * Created by kewang on 11/9/17.
 * <p>
 * <p>
 * Imagine array 0..N
 * <p>
 * Take element X (iterate from 0 to Nth element)
 * <p>
 * If value of element X is 0 then count how many 1 elements it has on the right
 * <p>
 * If value of element X is 1 then count how many 0 elements it has on left
 * <p>
 * Repeat for next X
 * <p>
 * Sum up and divide by 2 (cos it takes 2 cars to pass each other), that's the answer.
 * <p>
 * In case with 0 1 0 1 1 we have 3+1+2+2+2 = 10. Divide by 2 = 5 passings.
 */
public class PassingCars {
    public static void main(String[] args) {

        //   Scanner scn = new Scanner(System.in);
        //  int n = scn.nextInt();
        //    int[] A = new int[]{1, 3, 1, 3, 2, 5, 6, 4};
        int[] n = new int[]{1, 1, 0, 0, 1, 0, 1};
        n = new int[]{0, 1, 0, 1, 1};
        //A = 11, B = 345, K = 17
        System.out.println(solution(n));
    }

    public static int solution(int[] A) {
        int numberOntheLeft = 0;
        int numberOntheright = 0;
        int numberTotal = 0;

        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            if (temp == 1) {
                for (int j = i; j >= 0; j--) {
                    if (A[j] == 0) {
                        numberOntheLeft++;
                    }
                }
            } else {
                for (int m = i; m < A.length; m++) {
                    if (A[m] == 1) {
                        numberOntheright++;
                    }
                }
            }
            if (numberTotal > 1000000000) {
                numberTotal = -1;
                break;
            }
            numberTotal = numberOntheLeft + numberOntheright;

        }

        return numberTotal / 2;
    }
}
