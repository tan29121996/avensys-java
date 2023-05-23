package com.java.programs;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("1st pattern");
		for (int i = 5; i >= 1; i--) {
		    for (int j = 5; j >= i; j--) {
		        System.out.print(j);
		    }
		    System.out.println();
		}
		System.out.println();
		
		System.out.println("2nd pattern");
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        if (j % 2 == 1) {
		            System.out.print("1");
		        } else {
		            System.out.print("0");
		        }
		    }
		    System.out.println();
		}
		
	}
}
