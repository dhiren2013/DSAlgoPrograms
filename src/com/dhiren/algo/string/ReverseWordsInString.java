package com.dhiren.algo.string;

public class ReverseWordsInString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = " I like this string ?? ";

        ReverseWordsInString revWord = new ReverseWordsInString();

        String res = revWord.reverseWordsInString(str);
        System.out.println(str);
        System.out.println(res);


        char[] reverseWord = reverseWords();

        System.out.println("\n Reversed words String : ");
        for(char value:reverseWord)
            System.out.print(value);

    }

    // Method-1
    public String reverseWordsInString(String input)
    {
        String[] words = input.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s : words)
        {
            String rev = " ";
            for (int i = 0; i < s.length(); i++)
            {
                rev = s.charAt(i) + rev;
            }

            builder.append(rev);
        }

        return builder.toString().trim();
    }

    // Method-2
    public static char[] reverseWords() {
        // reverse the string
        char[] arr = "welcome to coding algorithms".toCharArray();

        System.out.println("\n Input String : ");
        for (char str:arr)
            System.out.print(str);

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
