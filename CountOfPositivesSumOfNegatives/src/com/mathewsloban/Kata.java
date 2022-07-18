package com.mathewsloban;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {

        int positive = 0;
        int negative = 0;
        int[] array = new int[2];

        if (input == null) return new int[]{};
        if (input.length == 0) return input;

        for (int x : input) {
            if (x > 0) positive++;
            if (x < 0) negative += x;
        }
        array[0] = positive;
        array[1] = negative;

        return array;
    }
}
