package com.mathewsloban;

public class DuplicateEncoder {
    public static String encode(String word) {

        String newWord = "";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (j == i) continue;
                if (Character.toLowerCase(chars[i]) == Character.toLowerCase(chars[j])) count++;
            }
            if (count == 0) newWord += "(";
            if (count > 0) newWord += ")";
        }
        return newWord;
    }
}