package com.example.pd2.utils;

public class TextCounter {

    public static int getCharsCount(String inputPhrase){
        return inputPhrase.length();
    }

    public static int getWordsCount(String inputPhrase){
        if(inputPhrase.trim().isEmpty()){
            return 0;
        }
        String[] words = inputPhrase.trim().split("\\s+");
        return words.length;
    }
}
