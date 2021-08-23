package com.company;

public class DayOfTheProgrammer {

    // https://www.hackerrank.com/challenges/day-of-the-programmer/problem

    public static String dayOfProgrammer(int year) {
        if (year <= 1917) {
            if (year % 4 == 0) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        } else if (year == 1918) {
            return "26.09." + year;
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
    }
}
