package com.java.methods;

import java.util.Scanner;

class Checker {
    boolean check(String name) {
        char[] nameChars = name.toCharArray();
        for (int i = 0; i < nameChars.length; i++) {
            if (nameChars[i] == 's' || nameChars[i] == 'S') {
                return true;
            }
        }
        return false;
    }
}

public class StringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        boolean result = checker.check(name);

        if (result) {
            System.out.println("The name contains 's'");
        } else {
            System.out.println("The name does not contain 's'");
        }
    }
}
