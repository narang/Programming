package com.company;

import java.util.List;

public class BillDivision {

    // https://www.hackerrank.com/challenges/bon-appetit/problem

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                total += bill.get(i);
            }
        }
        int actualBill = total / 2;
        if (actualBill == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actualBill);
        }
    }
}
