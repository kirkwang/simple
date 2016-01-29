package com.kirkwang.HackerRank;

import javafx.util.Pair;

import java.util.Scanner;

/**
 * Created by kewang on 10/31/17.
 */
public class AreaOfParallelogram {
    public static void main(String[] args) throws Exception

    {

        AreaOfParallelogram aop = new AreaOfParallelogram();
        Pair twoInts = aop.takeInput();

        double area;


        area = new Integer(twoInts.getKey().toString()) * new Integer(twoInts.getValue().toString());

        System.out.println("Area of parallelogram:" + area);


    }

    public Pair takeInput() throws Exception {
        Integer a, b;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the base of parallelogram:");

        a = s.nextInt();

        System.out.print("Enter the height of the parallelogram:");

        b = s.nextInt();
        if (a <= 0 || b <= 0) {
            throw new Exception("Breadth and height must be positive");
        }
        return new Pair(a, b);
    }
}
