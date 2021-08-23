package com.company;

import java.util.List;

public class PickingNumbers {

    // https://www.hackerrank.com/challenges/picking-numbers/problem

    public static int pickingNumbers(List<Integer> a) {
        int maxSize = 0;
        int firstElement = 0;
        int secondElement = 0;
        int secondElementIndex = 0;
        for (int i = 0; i < a.size(); i++) {
            int currentArraySize = 0;
            firstElement = a.get(i);
            for (int j = i + 1; j < a.size(); j++) {
                if (Math.abs(firstElement - a.get(j)) <= 1) {
                    secondElement = a.get(j);
                    secondElementIndex = j;
                    currentArraySize = 2;
                    for (int k = secondElementIndex + 1; k < a.size(); k++) {
                        int currentElement = a.get(k);
                        if (currentElement == firstElement || currentElement == secondElement) {
                            currentArraySize++;
                        }
                    }
                    if (currentArraySize > maxSize) {
                        maxSize = currentArraySize;
                    }
                }
            }

        }
        return maxSize;
    }

}
