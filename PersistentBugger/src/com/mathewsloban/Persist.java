package com.mathewsloban;

public class Persist {
    private static int multip = 1;
    private static int count = 1;

    public static int persistence(long n) {
        System.out.println("Number: " + n);
        char[] charArray = Long.toString(n).toCharArray();
        if (charArray.length == 1) {
            return 0;
        }
        for (char a : charArray) {
            multip *= Character.getNumericValue(a);
        }
        if (multip > 9) {
            int tmp = multip;
            multip = 1;
            count++;
            return persistence(tmp);
        }
        multip = 1;
        int tmp = count;
        count = 1;
        return tmp;
    }
}
