package com.mathewsloban;

public class PsychoSum {

    public static int add(int num1, int num2) {
        return (num1 != 0 && num2 != 0) ?
                Integer.parseInt("" + (add(num1 / 10, num2 / 10)) + ((num1 % 10) + (num2 % 10))) : num1 + num2;
    }
}
