package com.mathewsloban;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        ArrayList<Character> arrayList = (ArrayList<Character>) str1.chars().
                mapToObj(character -> (char) character).collect(Collectors.toList());
        for (char ch : str2.toCharArray()) {
            if (arrayList.indexOf(ch) == -1) return false;
            if (arrayList.indexOf(ch) != -1) arrayList.remove(arrayList.indexOf(ch));
        }
        return true;
    }
}
