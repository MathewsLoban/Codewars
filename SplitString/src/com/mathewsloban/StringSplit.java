package com.mathewsloban;

public class StringSplit {
    public static String[] solution(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        int length = stringBuilder.length() / 2;
        int index = 0;

        if (stringBuilder.length() % 2 != 0) {
            length = stringBuilder.length() / 2 + 1;
            stringBuilder.append('_');
        }

        String[] arrayString = new String[length];

        for (int i = 0; i < stringBuilder.length() / 2; i++) {
            arrayString[i] = stringBuilder.substring(index, index += 2);
        }
        return arrayString;
    }
}
