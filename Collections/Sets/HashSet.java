package com.java.methods;

import java.util.HashSet;

public class HashSet {
	public static void main(String[] args)  {
		HashSet hs = new HashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion order will not be preserved
	}

}