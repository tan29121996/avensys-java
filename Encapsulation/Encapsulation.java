package com.java.methods;

class Fan
{
	private int fanAmt;
	
	public void setFanAmt(int x)
	{
		if(x>0)
		{
			fanAmt = x;	
		} else { 
			System.out.println("Invalid amount.");
		}
	}
	
	public int getFanAmt()
	{
		return fanAmt;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.setFanAmt (100);
		int fanAmt = fan.getFanAmt();
		System.out.println("The fan amount is: " + fanAmt);
	}
}
