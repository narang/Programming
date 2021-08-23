package com.company;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    // https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> recordBreakCount = new ArrayList<>();
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);
        int highestScoreBreakCount = 0;
        int lowestScoreBreakCount = 0;

        for (int score : scores) {
            if (score > highestScore) {
                highestScoreBreakCount++;
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScoreBreakCount++;
                lowestScore = score;
            }
        }
        recordBreakCount.add(highestScoreBreakCount);
        recordBreakCount.add(lowestScoreBreakCount);
        return recordBreakCount;
    }
}
