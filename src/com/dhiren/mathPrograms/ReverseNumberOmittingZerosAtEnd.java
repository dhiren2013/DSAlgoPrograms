package com.dhiren.mathPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dhirendra.thakur on 12/10/14.
 */
public class ReverseNumberOmittingZerosAtEnd {

    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of usecase - ");
        String line = br.readLine();
        int N = Integer.parseInt(line);

        String message =null;
        int output=0;

        System.out.println("Enter the message - ");
        for (int i = 0; i < N; i++) {

            String s = br.readLine();
            int a = Integer.parseInt(s.substring(0, s.indexOf(" ")));
            int b = Integer.parseInt(s.substring(s.indexOf(" ")+1));

            System.out.println(reverse(reverse(a) + reverse(b)));
        }

    }

    public static int reverse(int n){

        String a = n + "";
        String b = "";

        boolean found = false;
        for(int i=a.length()-1;i>=0;i--){

            if(!a.substring(i, i+1).equals("0"))
                found=true;

            if(found)
                b+=a.substring(i, i+1);
        }
        return Integer.parseInt(b);
    }
}
