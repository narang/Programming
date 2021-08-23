package com.company;

import java.util.List;

public class SalesByMatch {

    // https://www.hackerrank.com/challenges/sock-merchant/problem

    public static int sockMerchant(int n, List<Integer> ar) {
        int[] a = new int[100];
        int count = 0;
        for (int i : ar) {
            a[i-1]++;
        }
        for (int i = 0; i < 100; i++) {
            count += a[i] / 2;
        }
        return count;
    }
}
