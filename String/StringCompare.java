package com.java.methods;

import java.util.Scanner;

class Checker {
    boolean check(String name1, String name2) {
        if (name1.compareTo(name2) > 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class StringCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.print("Enter the first string: ");
        String name1 = s.nextLine();

        System.out.print("Enter the second string: ");
        String name2 = s.nextLine();

        boolean result = checker.check(name1, name2);

        if (result == true) {
            System.out.println("The first name is greater");
        } else if (result == false) {
            System.out.println("The second name is greater");
        } else {
            System.out.println("The two names are equal");
        }
    }
}