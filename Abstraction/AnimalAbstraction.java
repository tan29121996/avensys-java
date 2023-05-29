package com.java.methods;

abstract class Animal
{
	abstract public void run();
	abstract public void hunt();
}
abstract class Lion extends Animal
{
	public void run() {
		System.out.println("Lions run on all fours");
	}
}
abstract class Human extends Animal
{
	public void run() {
		System.out.println("Humans run on two legs");
	}
}
class AsianLion extends Lion
{
	public void hunt() {
		System.out.println("Asian Lions hunt in forests");
	}
}
class AfricanLion extends Lion
{
	public void hunt() {
		System.out.println("African Lions hunt in savannah");
	}
}
class VegHuman extends Human
{
	public void hunt() {
		System.out.println("Vegetarian Humans plant vegetables");
	}
}
class NonVegHuman extends Human
{
	public void hunt() {
		System.out.println("Non-Vegetarian Humans hunt animals");
	}
}
class Forest
{
	public void acceptAnimals(Animal ref) {
		ref.run();
		ref.hunt();
	}
}
class AnimalAbstraction extends Object {
	
	public static void main(String[] args) {
		
		AsianLion asl = new AsianLion();
		AfricanLion afl = new AfricanLion();
		VegHuman vh = new VegHuman();
		NonVegHuman nvh = new NonVegHuman();
		Forest f = new Forest();
		f.acceptAnimals(asl);
		f.acceptAnimals(afl);
		f.acceptAnimals(vh);
		f.acceptAnimals(nvh);
	
	} 
}
