package com.company;

import java.util.List;

public class SubarrayDivision {

    // https://www.hackerrank.com/challenges/the-birthday-bar/problem

    public static int birthday(List<Integer> s, int d, int m) {
        int len = s.size();
        int sum;
        int count = 0;

        for (int i = 0; i <= len - m; i++) {
            sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
