package com.dhiren.algo.string;

/**
 * Created by dhirendra.thakur on 26/09/14.
 */
public class ReplaceSpaceInString {

    public static void main(String[] ar){

        ReplaceSpaceInString repSp = new ReplaceSpaceInString();

        String in = "the dog is good";
        char[] ch = in.toCharArray();                           //{'t','h','e',' ','d','o','g',' ',' ',' ',' ',' ',' '};
        int len = ch.length;
        repSp.replaceSpace(ch, len);
    }

    // Replace space with %20
    public void replaceSpace(char[] str, int len){

        int spaceCount=0, newLength, i;

        // Count the spaces in String
        for(i=0; i< len; i++){

            if(str[i] == ' ')
                spaceCount++;
        }

        newLength = len + (spaceCount*2);
        str[newLength]='\0';

        //Iterating from back of the string to replace space with '%20'
        for(i=len; i >0; i--)
        {
            if(str[i]==' '){

                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';

                newLength = newLength -3;
            }else{

                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(str);
    }
}
