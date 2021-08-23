package com.company;

public class CountingValleys {

    // https://www.hackerrank.com/challenges/counting-valleys/problem

    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valleyCount = 0;
        boolean inValley = false;
        for (int i = 0; i < steps; i++) {
            char c = path.charAt(i);
            if (c == 'U') {
                level++;
            } else {
                level--;
            }

            if (level < 0) {
                inValley = true;
            }

            if (inValley && level == 0) {
                inValley = false;
                valleyCount++;
            }
        }
        return valleyCount;
    }
}
