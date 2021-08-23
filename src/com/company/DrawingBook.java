package com.company;

public class DrawingBook {

    // https://www.hackerrank.com/challenges/drawing-book/problem

    public static int pageCount(int n, int p) {
        int flipCountFromFront, flipCountFromBack;
        flipCountFromFront = p / 2;
        if (n % 2 == 0) {
            flipCountFromBack = (n + 1 - p) / 2;
        } else {
            flipCountFromBack = (n - p ) / 2;
        }

        return Math.min(flipCountFromFront, flipCountFromBack);
    }
}
