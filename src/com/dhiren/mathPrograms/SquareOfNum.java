package com.dhiren.mathPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dhirendra.thakur on 12/10/14.
 */
public class SquareOfNum {

    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter total number of testcase : ");

        String inputTestCase = br.readLine();
        int N = Integer.parseInt(inputTestCase);

        System.out.println("Enter number to find square : ");
        for (int i = 0; i < N; i++) {

            String inputNum = br.readLine();
            int num = Integer.parseInt(inputNum);

            int sqrN = squareNum(num);
            System.out.println("Square of Number is : " + sqrN);
        }


    }

    public static int squareNum(int num){

        int sqrNum = num*num;

        return sqrNum;
    }
}
