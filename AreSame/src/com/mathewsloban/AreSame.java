package com.mathewsloban;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class AreSame {

    public static boolean comp(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) return false;
        if (array1.length == 0 && array2.length == 0) return true;
        if (array1.length == 0 || array2.length == 0) return false;

        ArrayList<Integer> arrayList2 = (ArrayList<Integer>) Arrays.stream(array2).boxed().collect(Collectors.toList());

        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayList2.size(); j++) {
                if (Math.pow(array1[i], 2) == arrayList2.get(j)) {
                    arrayList2.remove(j);
                    count++;
                    break;
                }
            }
            if (count == 0) return false;
        }
        return true;
    }
}
