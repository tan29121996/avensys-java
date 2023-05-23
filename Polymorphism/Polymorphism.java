package com.java.methods;

class Animal
{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Tiger extends Animal
{
	public void eat() {
		System.out.println("Tiger is eating");
	}
	public void sleep() {
		System.out.println("Tiger is sleeping");
	}
}

class Lion extends Animal
{
	public void eat() {
		System.out.println("Lion is eating");
	}
	public void sleep() {
		System.out.println("Lion is sleeping");
	}
}

class Dog extends Animal
{
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}

class Forest
{
	public void acceptAnimal(Animal ref) {
		ref.eat();
		ref.sleep();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Tiger ta = new Tiger(); 
		Lion la = new Lion();
		Dog da = new Dog(); 
		Forest f = new Forest();
		f.acceptAnimal(ta);
		f.acceptAnimal(la);
		f.acceptAnimal(da);
	} 
}
