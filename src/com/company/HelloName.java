package com.company;

import java.util.Scanner;

public class HelloName {

    private static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        printName(scanner.nextLine());
        scanner.close();
    }
}
