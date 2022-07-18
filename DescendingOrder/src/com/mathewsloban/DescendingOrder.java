package com.mathewsloban;


import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        char[] chars = Integer.toString(num).toCharArray();
        Integer[] array = new Integer[chars.length];
        for (int i = 0; i < chars.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        Arrays.sort(array, Collections.reverseOrder());
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }

        return Integer.parseInt(str);
    }
}
