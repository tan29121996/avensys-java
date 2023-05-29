package com.java.objects;

import java.util.Scanner;

public class ArrayBank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int b[][] = new int[5][];
		b[0] = new int[3];
		b[1] = new int[1];
		b[2] = new int[4];
		b[3] = new int[5];
		b[4] = new int[2];
		
		for(int i =0; i < b.length; i++) {
			for(int j =0; j < b[i].length; j++) {
				System.out.printf("Enter customer %d's amount in bank %d: %n", j+1, i+1);
				b[i][j] = scan.nextInt();
			}
		}
		
		for(int i =0; i < b.length; i++) {
			for(int j =0; j < b[i].length; j++) {
				System.out.printf("Customer %d's amount in bank %d is: $%d%n", j+1, i+1, b[i][j]);
			}
		}
	}
}
