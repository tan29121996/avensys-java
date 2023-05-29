package arrays;

import java.util.Scanner;

public class ArrayKey {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);    
		
		System.out.println("Length of array:");
		int len = kb.nextInt();
		int a[] = new int[len];
		
		System.out.println("Enter key to search for in array");
		int key = kb.nextInt();

		for(int i=0;i<a.length;i++)
		{
			a[i] = (i+1)*10;
		}		

		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}	
				
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == key)
			{
				System.out.println("Key found with value " + key + " at a[" + i + "]");
				return;
			}
		}

		System.out.println("Key not found");
				
		kb.close();

	}

}
