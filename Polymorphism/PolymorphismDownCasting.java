package com.java.methods;

class Teacher
{
	public void teach()
	{
		System.out.println("Teacher is teaching");
	}
}

class PhysicsTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Physics Teacher is teaching Physics");
	}
	public void doExp()
	{
		System.out.println("Physics teacher is doing expreiment");
	}
}

class ChemistryTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Chemistry Teacher is teaching Chemistry");
	}
	public void doExp()
	{
		System.out.println("Chemistry teacher is doing expreiment");
	}

}

class BiologyTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Biology Teacher is teaching Biology");
	}
	public void doExp()
	{
		System.out.println("Biology teacher is doing expreiment");
	}

}

public class PolymorphismDownCasting {
	// Parent class ref can access only inherited and overridden methods of child class but not specialized method
	public static void main(String[] args) {
		PhysicsTeacher pt = new PhysicsTeacher(); 
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher(); 
		Teacher ref;
		ref = pt;
		ref.teach();
		((PhysicsTeacher)ref).doExp(); //down casting
		ref = ct;
		ref.teach();
		((ChemistryTeacher)ref).doExp();
		ref = bt;
		ref.teach();
		((BiologyTeacher)ref).doExp();
	}
}
