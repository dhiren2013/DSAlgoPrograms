package com.dhiren.mathPrograms;

import java.util.Scanner;

/**
 * Created by dhirendra.thakur on 12/10/14.
 */
public class StringLenthWithOutUsingFunction {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number of String : ");
        String inputNum = sc.nextLine();
        int noOfString = Integer.parseInt(inputNum);

        System.out.print("\nEnter Your Name =>" +"  ");

        int lenOfStr =0;
        String str = null;
        for(int i=0; i<noOfString; i++){

           str = sc.nextLine();
           lenOfStr = len(str);

            System.out.println("\nName Length is:" + lenOfStr);
        }


    }

    public static int len(String ab){
        char[] ac = ab.toCharArray();
        int i = 0, k = 0;

        try{
            for(i=0,k=0;ac[i]!='\0';i++)
                k++;
        }
        catch(Exception e){
        }
        return k;
    }
}
