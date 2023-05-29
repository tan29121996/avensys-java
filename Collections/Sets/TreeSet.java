package com.java.methods;

import java.util.TreeSet;

public class TreeSet {
	public static void main(String[] args)  {
		
		TreeSet ts = new TreeSet(); // Red - Black algorithm
	
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		
		System.out.println(ts.ceiling(45));
		System.out.println(ts.floor(9));
		System.out.println(ts.higher(40));
		System.out.println(ts.lower(10));
	}
}