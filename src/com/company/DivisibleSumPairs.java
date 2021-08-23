package com.company;

import java.util.List;

public class DivisibleSumPairs {

    // https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
