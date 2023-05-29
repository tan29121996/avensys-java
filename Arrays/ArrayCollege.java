package com.java.objects;

import java.util.Scanner;

public class ArrayCollege {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);    
 
		int college[][][] = new int[3][][];
		
		college[0] = new int[3][];
		college[1] = new int[2][];
		college[2] = new int[4][];
		
		college[0][0] = new int[3];
		college[0][1] = new int[2];
		college[0][2] = new int[4];
		
		college[1][0] = new int[5];
		college[1][1] = new int[3];
		
		college[2][0] = new int[1];
		college[2][1] = new int[4];
		college[2][2] = new int[2];
		college[2][3] = new int[3];
		
		for(int i=0;i<college.length;i++)
		{
			for (int j=0;j<college[i].length;j++)
			{
				for (int k=0;k<college[i][j].length;k++)
				{
					System.out.println("Co"+ (i+1) +", Cl"+ (j+1) +", S" + (k+1) + ", Marks = ");
					college[i][j][k] = kb.nextInt();
				}
			}
			System.out.println();
		}
		

		for(int i=0;i<college.length;i++)
		{
			for (int j=0; j<college[i].length;j++)
			{
				for (int k=0; k<college[i][j].length;k++)
				{
					System.out.println("College " + i + ", Class " + j + ", Student " + k + " Mark:" + college[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
