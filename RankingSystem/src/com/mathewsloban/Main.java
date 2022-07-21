package com.mathewsloban;


public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Current rank: " + user.getCurrentRank());
        System.out.println("Current progress: " + user.getCurrentProgress());
        user.incProgress(-8);
        System.out.println("Current progress: " + user.getCurrentProgress());
        user.incProgress(-6);
        System.out.println("Current rank: " + user.getCurrentRank());
        System.out.println("Current progress: " + user.getCurrentProgress());
        user.incProgress(-4);
        System.out.println("Current rank: " + user.getCurrentRank());
        System.out.println("Current progress: " + user.getCurrentProgress());
        user.incProgress(0);
        System.out.println("Current rank: " + user.getCurrentRank());
        System.out.println("Current progress: " + user.getCurrentProgress());
        user.incProgress(9);
        System.out.println("Current rank: " + user.getCurrentRank());
        System.out.println("Current progress: " + user.getCurrentProgress());
        user.incProgress(1);
    }
}
