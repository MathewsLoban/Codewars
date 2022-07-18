package com.mathewsloban;


import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }


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
        System.out.println(str);
        return Integer.parseInt(str);
    }
}
