package com.mathewsloban;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target == numbers[i] + numbers[j]) return new int[]{i, j};
            }
        }
        return null;
    }
}