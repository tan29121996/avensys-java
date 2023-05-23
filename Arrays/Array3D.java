package com.java.objects;

import java.util.Scanner;

public class Array3D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a[][][] = new int[3][][];
		
		a[0] = new int[3][];
		a[1] = new int[2][];
		a[2] = new int[4][];
		
		a[0][0] = new int[3];
		a[0][1] = new int[2];
		a[0][2] = new int[4];
		
		a[1][0] = new int[5];
		a[1][1] = new int[3];
		
		a[2][0] = new int[1];
		a[2][1] = new int[4];
		a[2][2] = new int[2];
		a[2][3] = new int[3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.printf("Enter College %d Class %d Student %d marks: ", i+1, j+1, k+1);
					a[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.printf("College %d Class %d Student %d marks is: %d%n", i+1, j+1, k+1, a[i][j][k]);
				}
			}
		}
	}
}
