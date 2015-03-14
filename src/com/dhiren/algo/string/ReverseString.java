package com.dhiren.algo.string;

public class ReverseString {
	
//	public static void main(String[] ar){
//
//		char[] res = reverseWords();
//
//		System.out.println(res);
//	}

    // Below one more static main is present
	
	//Method-1
	public static String reverseWords2(String sentence) {
	    StringBuilder sb = new StringBuilder(sentence.length() + 1);
	    String[] words = sentence.split(" ");
	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]).append(' ');
	    }
	    sb.setLength(sb.length() - 1);  // Strip trailing space
	    return sb.toString();
	}	
	

    /* Method-2
    *This suggested solution does not create all the intermediate String objects that the other solutions create, and it uses O(1) extra memory space
    *
    * */

    public static void main(String[] args) {
        String[] input = {"", null, "a", "this is", "this    is", " this is "};
        for (String in : input) {
            System.out.println("Split: -> |" + reverseString(in) + "|");
            System.out.println("Array: -> |" + reverseStringFP(in) + "|");

        }
    }

    private static final String reverseString(String input) {
        if (input == null) {
            return null;
        }
        String[] parts = input.trim().split("\\s+");            // \\s+ - matches sequence of one or more whitespace characters.
        if (parts.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(parts[parts.length - 1]);
        for (int i = parts.length - 2; i >= 0; i--) {
            sb.append(" ").append(parts[i]);
        }
        return sb.toString();
    }

    private static final String reverseStringFP(final String input) {
        if (input == null) {
            return null;
        }
        if (input.isEmpty()) {
            return "";
        }
        final char[] inchar = input.toCharArray();
        // + 1 to allow for a temporary trailing space
        final char[] outchar = new char[inchar.length + 1];
        int outpos = 0;
        int wordend = inchar.length - 1;
        while (wordend >= 0) {
            while (wordend >= 0 && inchar[wordend] == ' ') {
                wordend--;
            }
            int wordstart = wordend;
            while (wordstart > 0 && inchar[wordstart - 1] != ' ') {
                wordstart--;
            }
            if (wordstart >= 0) {
                int len = wordend - wordstart + 1;
                System.arraycopy(inchar, wordstart, outchar, outpos, len);
                outpos += len;
                outchar[outpos++] = ' ';
                wordend = wordstart - 1;
            }
        }
        if (outpos > 0) {
            // deal with trailing space
            outpos--;
        }
        return new String(outchar, 0, outpos);
    }
}
