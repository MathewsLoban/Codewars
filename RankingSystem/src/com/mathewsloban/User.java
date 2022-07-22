package com.mathewsloban;

import java.util.ArrayList;
import java.util.Arrays;

class User {
    private int currentRank = -8;
    private int currentProgress = 0;
    private ArrayList<Integer> arrayListRank =
            new ArrayList<>(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8));

    public int getCurrentRank() {
        return currentRank;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentRank(int currentRank) {
        this.currentRank = currentRank;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }

    public void incProgress(int rankActivities) {
        if (arrayListRank.indexOf(rankActivities) == -1) {
            try {
                throw new Exception("Invalid rank activities.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.progresPointCalculation(rankActivities);
        this.checkUpdateRank();
    }

    private void progresPointCalculation(int rankActivities) {
        if (this.currentRank == 8) return;
        int rankDiff = this.arrayListRank.indexOf(rankActivities) - this.arrayListRank.indexOf(this.currentRank);
        if (rankDiff <= -2) return;
        if (rankDiff == 0) this.currentProgress += 3;
        if (rankDiff == -1) this.currentProgress += 1;
        if (rankDiff >= 1) this.currentProgress += 10 * rankDiff * rankDiff;
    }

    private void checkUpdateRank() {
        while (this.currentProgress > 100) {
            if (this.currentRank == 8) {
                this.currentProgress = 0;
                System.out.println("Your rank is max.");
            }
            if (this.currentProgress >= 100 && this.currentRank < 7) {
                this.currentProgress = this.currentProgress - 100;
                this.currentRank = this.arrayListRank.get(this.arrayListRank.indexOf(this.currentRank) + 1);
            }
            if (this.currentProgress >= 100 && this.currentRank == 7) {
                this.currentProgress = 0;
                this.currentRank = this.arrayListRank.get(this.arrayListRank.indexOf(this.currentRank) + 1);
            }
        }
    }
}

