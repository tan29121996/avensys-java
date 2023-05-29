package com.demo.learnspringboot;

public class Customer {
	private String name;
	private String address;
	private int number;
	
	public Customer(String name, String address, int number, int amount) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getNumber() {
		return number;
	}
	public int getAmount() {
		return amount;
	}
	private int amount;
}
