package com.java.programs;

public class PatternTwo {
	public static void main(String[] args) {
		
		// 1st pattern
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 6; j++) {
            	if ((i == 0 && j%3 != 0) || (i == 1 && j%3 == 0) || (i-j==2) || (i+j == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // 2nd pattern
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 8; j++) {
            	if ((i+j == 4) || (j-i == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
