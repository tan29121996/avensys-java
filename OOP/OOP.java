package com.java.objects;

class Fan {
	String color;
	String brand;
	int noOfWings;
	
	void rotate() {
		System.out.println("The fan is rotating.");
	}
	
	void stop() {
		System.out.println("The fan is stopping.");
	}
	
	void blowAir() {
		System.out.println("The fan is blowing air.");
	}
}

public class OOP {
	public static void main(String[] args) {
		Fan panasonic = new Fan();
		Fan daiko = new Fan();
		Fan dyson = new Fan();
		
		panasonic.rotate();
		daiko.stop();
		dyson.blowAir();
	}
}
