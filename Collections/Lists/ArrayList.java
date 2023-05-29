package com.java.methods;

import java.util.ArrayList;

public class ArrayList
	public static void main(String[] args)  {
		
		ArrayList al = new ArrayList(); // Dynamic Array
		System.out.println(al.isEmpty());
		System.out.println(al.size());// 0
		al.ensureCapacity(5); // Ensure minimum capacity
		al.add("Siddu");
		al.add(1000);
		al.add(3.4);
		al.add('c');
		al.add(34);
		al.add('E');
		al.add('E');
		al.add('E');
		al.add('E'); // duplicates are allowed
		System.out.println(al.size()); // 4
		System.out.println(al);// it follows insertion order
		
		ArrayList al2 = new ArrayList();
		al2.add("Siddu");
		al2.add(1000);
		
		al.retainAll(al2);
		System.out.println(al);
		System.out.println(al.isEmpty());
	}

}