package com.java.methods;

import java.util.LinkedHashSet;

//Linked Hash Set - Hash Set with preserved insertion order
public class LinkedHashSet {
	public static void main(String[] args)  {
		LinkedHashSet hs = new LinkedHashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion is preserved
	}
}