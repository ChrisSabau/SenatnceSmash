package com.company;

public class Smash {

    public static void main(String[] args) {
	// write your code here
    }
    public static String smashSentance(String[] words) {
        String sentence = "";
        if (words != null) {
            for (int i = 0; i < words.length; i++) {
                sentence = sentence + " " + words[i];
            }
            return sentence.trim();
        } else
            return null;
    }
}
