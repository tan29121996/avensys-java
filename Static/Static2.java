package com.java.methods;

import java.util.Scanner;

class Student
{
	String name;
	int age;
	int marks;
	static String college; // with static
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student's name");
		name = scan.nextLine();
		System.out.println("Enter the student's age");
		age = scan.nextInt();
		System.out.println("Enter the student's marks");
		marks = scan.nextInt();
		college = "Harvard";
	}
	
	public void display()
	{
		System.out.println("The student's name is " + name + ", age " + age + ", with " + marks + " marks from " + college);
	}
}

public class Static extends Object {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.acceptInput();
		s1.display();
		System.out.println("**************************");
		s2.acceptInput();
		s2.display();
		System.out.println("**************************");
		s3.acceptInput();
		s3.display();
	}
}