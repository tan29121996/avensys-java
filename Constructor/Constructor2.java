package com.java.methods;

/* Constructor OverLoading **/
class Fan extends Object
{
	private String name; 
	private int wingNum;     
	private String colour; 
	
	public Fan() 
	{
		
	}
	public Fan(String name, int wingNum, String colour)
	{
		this();
		this.name = name;
		this.wingNum = wingNum;
		this.colour = colour;	
	}
	public Fan(String name, int wingNum)
	{
		this("Dyson", 3, "Black");
		this.name = name;
		this.wingNum = wingNum;
	}
	public Fan(String name)
	{
		this("Daikin", 4);
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public int getWingNum()
	{
		return wingNum;
	}
	public String getColour()
	{
		return colour;
	}
}

public class Constructor extends Object {
	
	public static void main(String[] args) {
		Fan s = new Fan("Daiko");
		System.out.println(s.getName());
		System.out.println(s.getWingNum());
		System.out.println(s.getColour());
	}
}