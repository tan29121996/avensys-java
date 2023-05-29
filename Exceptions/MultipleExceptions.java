package com.java.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
	public static void main(String[] args) {
		try {
			System.out.println("Connection Established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number:");
			int a = scan.nextInt();
			System.out.println("Enter second number:");
			int b = scan.nextInt();
			int c = a % b;
			System.out.println("The modulo is:" + c);
			System.out.println("Enter the array length:");
			int len = scan.nextInt();
			int arr[] = new int[len];
			System.out.println("Enter the element to store in array:");
			int ele = scan.nextInt();
			System.out.println("Enter the index:");
			int pos = scan.nextInt();
			arr[pos] = ele;
			System.out.println("The element " + ele + " is stored in the " + pos + " index");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You cannot give the second number as a zero");
		}
		catch(NegativeArraySizeException ne)
		{
			System.out.println("You cannot pass a negative value as the array size");
		}
		catch(InputMismatchException ie)
		{
			System.out.println("You have given an invalid input");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("You have given an invalid position");
		}
		//Generic Catch Block
		catch(Exception e)
		{
			System.out.println("Some Problem Occured");
		}
		System.out.println("Connection is Closed");
	}
}
