package com.java.methods;

import java.util.List;
import java.util.PriorityQueue;

// Priority Queue - store elements by priority, smallest value will be at the start
public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(); // Min Heap data structure
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		System.out.println(pq);
	}

}