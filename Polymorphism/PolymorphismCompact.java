package com.java.methods;

class Teacher {
  public void teach() {
    System.out.println("Teacher is teaching.");
  }

  public void doExp() {
    System.out.println("Teacher is conducting an experiment.");
  }
}

class PhysicsTeacher extends Teacher {
  public void teach() {
  System.out.println("Physics teacher is teaching physics.");
  }

  public void doExp() {
    System.out.println("Physics teacher is conducting a Physics experiment.");
  }
}

class ChemistryTeacher extends Teacher {
  public void teach() {
    System.out.println("Chemistry teacher is teaching chemistry");
  }

  public void doExp() {
    System.out.println("Chemistry teacher is conducting a Chemistry experiment.");
  }
}

class BiologyTeacher extends Teacher {
  public void teach() {
    System.out.println("Biology teacher is teaching biology.");
  }

  public void doExp() {
    System.out.println("Biology teacher is conducting a Biology experiment.");
  }
}

class College {
  public void acceptTeacher(Teacher teacher) {
    teacher.teach();
    teacher.doExp();
  }
}

public class PolymorphismCompact extends Object {
	public static void main(String[] args) {
		PhysicsTeacher pt = new PhysicsTeacher(); 
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher(); 
		College c = new College();
		c.acceptTeacher(pt);
		c.acceptTeacher(ct);
		c.acceptTeacher(bt);
	} 
}
