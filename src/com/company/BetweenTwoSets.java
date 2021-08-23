package com.company;

import java.util.List;

public class BetweenTwoSets {

    // https://www.hackerrank.com/challenges/between-two-sets/problem

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int maxOfFirst = a.get(a.size() - 1);
        int minOfSecond = b.get(b.size() - 1);

        outer: for (int i = maxOfFirst; i <= minOfSecond; i++) {
            for (int num : a) {
                if (i % num != 0) continue outer;
            }
            for (int num : b) {
                if (num % i != 0) continue outer;
            }
            count++;
        }
        return count;
    }

}
