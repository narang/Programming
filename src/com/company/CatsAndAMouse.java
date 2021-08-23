package com.company;

public class CatsAndAMouse {

    // https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

    static String catAndMouse(int x, int y, int z) {
        int timeForCatA = Math.abs(x - z);
        int timeForCatB = Math.abs(y - z);
        if (timeForCatA < timeForCatB) {
            return "Cat A";
        } else if (timeForCatB < timeForCatA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}
