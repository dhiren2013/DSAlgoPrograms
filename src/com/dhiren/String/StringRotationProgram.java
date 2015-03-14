package com.dhiren.String;

/**
 * Created by dhirendra.thakur on 2/25/15.
 */
public class StringRotationProgram {

    public static void main(String[] ar){

        String str = "My name is dhiren";
        String[] words = str.split(" ");

        int ROT = 2;

        for(int i=0; i<words.length; i++){

            System.out.println(words[(i + words.length - ROT)%words.length]+" ");
        }
    }
}
