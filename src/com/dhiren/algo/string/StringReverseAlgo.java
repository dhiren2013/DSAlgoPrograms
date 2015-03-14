package com.dhiren.algo.string;

/*
* referred from : tekmarathon.com/2013/06/14/algorithm-to-reverse-words-of-a-string/
* */
public class StringReverseAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     char[] res = reverseWords();

     System.out.println("\n Reversed words String : ");
     for(char value:res)
         System.out.print(value);
    }

    public static char[] reverseWords() {
        // reverse the string
        char[] arr = "welcome to coding algorithms".toCharArray();

        System.out.println("\n Input String : ");
        for (char str:arr)
            System.out.print(str);

        reverse(arr, 0, arr.length / 2, arr.length);

        System.out.println("\n Reversed String : ");
        for (char revStr:arr)
            System.out.print(revStr);

        // reverse words of a string
        int wordIdx = 0;
        int wordMidIdx = 0;
        int prevWordLastIdx = 0;

        // outer loop to track spaces
        for (int sentenceIdx = 0; sentenceIdx < arr.length; sentenceIdx++) {
            if (arr[sentenceIdx] != ' ')
                continue;

            wordIdx = prevWordLastIdx;
            int wordLastIdx = sentenceIdx;
            wordMidIdx = (sentenceIdx + wordIdx) / 2;
            // reverse each word in a string
            reverse(arr, wordIdx, wordMidIdx, wordLastIdx);
            prevWordLastIdx = sentenceIdx + 1;
        }

        // reverse last word
        wordIdx = prevWordLastIdx;
        wordMidIdx = (arr.length + wordIdx) / 2;
        reverse(arr, wordIdx, wordMidIdx, arr.length);

        return arr;
    }

    private static void reverse(char[] arr, int wordIdx, int wordMidIdx,
                                int wordLastIdx) {
        for (; wordIdx < wordMidIdx; wordIdx++) {
            // swap first letter with the last letter in the
            char tmp = arr[wordIdx];
            arr[wordIdx] = arr[wordLastIdx - 1];
            arr[wordLastIdx - 1] = tmp;
            wordLastIdx--;
        }
    }

}
