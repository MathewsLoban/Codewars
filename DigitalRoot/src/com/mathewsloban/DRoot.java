package com.mathewsloban;

public class DRoot {
    public static int sum = 0;

    public static int digital_root(int n) {
        sum += n % 10;
        if (n / 10 != 0) return digital_root(n / 10);
        if (n / 10 == 0 && sum / 10 != 0) {
            int x = sum;
            sum = 0;
            return digital_root(x);
        }
        int result = sum;
        sum = 0;
        return result;
    }
}