package com.java.methods;

class Teacher
{
	void markAttendance()
	{
		System.out.println("Teacher is marking attendance");
	}
	
	void teach()
	{
		System.out.println("Teacher is teaching");
	}
}

class PhysicsTeacher extends Teacher
{
	void teach() // Overridden Method
	{
		System.out.println("Physics teacher is teaching physics");
	}
	
	void labExpPhy() // Specialized Method
	{
		System.out.println("Physics teacher is doing experiments in lab");
	}
}

class BiologyTeacher extends Teacher
{
	void teach()
	{
		System.out.println("Biology teacher is teaching biolody");
	}
	
	void labExpBio()
	{
		System.out.println("Biology teacher is doing experiments in lab");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.markAttendance();
		pt.teach();
		
		BiologyTeacher bt = new BiologyTeacher();
		bt.markAttendance();
		bt.teach();
	}
}
