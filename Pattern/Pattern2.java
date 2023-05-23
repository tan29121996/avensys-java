package com.java.programs;

public class Pattern2 {
	public static void main(String[] args) {
		System.out.println("1st exercise" + "\n");
		for (int i = 0; i < 5; i++) {
			char alpha = 'E';
		    for (int j = 0; j <= i; j++) {
		        System.out.print((char)(alpha - j));
		    }
		    System.out.println();
		}
		System.out.println();
		
		System.out.println("2nd exercise" + "\n");
		for (int i = 0; i < 5; i++) {
			char alpha = 'A';
		    for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 4; j >= i; j--) {
		        System.out.print((char)(alpha + j - i));
		    }
		    System.out.println();
		}
		System.out.println();
		
		System.out.println("3rd exercise" + "\n");
		for (int i = 1; i <= 5; i++) {
			char alpha = 'A';
		    for (int j = 5; j > i; j--) {
		        System.out.print(" ");
		    }
		    for (int j = 0; j <= 2*i-2; j++) {
		        System.out.print((char)(j + alpha));
		    }
		    System.out.println();
		}
	}
}
