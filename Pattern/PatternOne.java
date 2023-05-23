package com.java.programs;

import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = scanner.nextInt(); 
		
		System.out.println("Here is your pattern:");
		
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
	
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("*");
              } else {
                System.out.print(" ");
              }
            }
            System.out.println();
          }
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
          }
          for (int k = 1; k <= i; k++) {
            if (k == 1 || k == i || i == n) {
              System.out.print("* ");
            } else {
              System.out.print("  ");
            }
          }
          System.out.println();
        }
        System.out.println();
        
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
            	if ((i+j == 2) || (i-j == 2) || (j-i == 2) || (i == 3 && j == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
            	if (((i+j)%2 == 0) || (i+j == 8) || (i == 1 && j%3 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
