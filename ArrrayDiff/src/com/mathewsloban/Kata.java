package com.mathewsloban;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static int[] arrayDiff(int[] array1, int[] array2) {
        if (array1.length == 0) return new int[]{};
        ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.stream(array1).boxed().collect(Collectors.toList());
        for (int a : array2) {
            while (arrayList.indexOf(a) != -1) {
                arrayList.remove(arrayList.indexOf(a));
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
