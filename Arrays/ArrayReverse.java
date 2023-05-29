package com.java.objects;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);    
		
		System.out.println("Length of array:");

		int len = kb.nextInt();
		int a[] = new int[len];
		
		int b[] = new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = i*10;
		}		
		
		for(int i=0;i<b.length;i++)
		{
			b[i] = a[a.length-1-i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b at ["+i+"] is "+ b[i]);
		}
		
		kb.close();
		
	}

}
