package com.mathewsloban;

/**
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5
 * below the number passed in. Additionally, if the number is negative, return 0
 * (for languages that do have them).
 */

public class Solution {

    private int sum = 0;

    public int solution(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

