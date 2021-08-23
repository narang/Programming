package com.company;

public class ElectronicsShop {

    // https://www.hackerrank.com/challenges/electronics-shop/problem

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPossible = 0;
        for (int i = 0; i < keyboards.length; i++) {
            int keyboardPrice = keyboards[i];
            for (int j = 0; j < drives.length; j++) {
                int drivePrice = drives[j];
                int total = keyboardPrice + drivePrice;
                if (total > b) continue;
                else if (total == b) return total;
                else {
                    if (total > maxPossible) {
                        maxPossible = total;
                    }
                }
            }
        }
        return maxPossible == 0 ? -1 : maxPossible;
    }
}
