package com.java.objects;

import java.util.Scanner;

public class ArrayCopy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int len = scan.nextInt();
		
		System.out.println("Array has been created with size of " + len);
		int a[] = new int[len];
		
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		int b[] = new int[a.length];
		
		System.out.println("Enter the key to be found: ");
		int key = scan.nextInt();
		
		boolean keyFound = false;
		
		for (int i = 0; i < b.length; i++) {
		    if (a[i] == key) {
		        System.out.println("Key is found at index value " + i);
		        keyFound = true;
		        break;
		    }
		    b[i] = a[a.length - i - 1];
		}

		if (!keyFound) {
		    System.out.println("Key not found.");
		}
	}
}
