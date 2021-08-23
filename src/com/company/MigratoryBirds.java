package com.company;

import java.util.List;

public class MigratoryBirds {

    // https://www.hackerrank.com/challenges/migratory-birds/problem

    public static int migratoryBirds(List<Integer> arr) {
        int[] a = new int[5];
        for (int id : arr) {
            a[id-1]++;
        }
        int maxId = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] > count) {
                count = a[i];
                maxId = i + 1;
            }
        }
        return maxId;
    }
}
