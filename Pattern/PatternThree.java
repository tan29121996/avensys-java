package com.java.programs;

public class PatternThree {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
		    for (int j = 0; j <= i; j++) {
		        System.out.print((char)(65 + i));
		    }
		    System.out.println();
		}
		System.out.println();
		
		char alpha = 'A';
		
		for (int i = 0; i<5; i++) {
		    for (int j = 0; j <= i; j++) {
		    	if (i%2 == 0) {
		    		System.out.print((char)(alpha));
		    	} else {
		    		System.out.print((char)(alpha + 1));
		    	}
		    }

		    System.out.println();
		}
		System.out.println();
		
		int i = 0;
		
		for (System.out.println("Hi"); i<=3; System.out.println("world")) {
		    System.out.println("Hello");
		    i++;
		}
		System.out.println();
	}
}
