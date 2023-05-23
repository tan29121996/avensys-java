package com.java.methods;

import java.util.Scanner;

class UnderAgeException extends Exception {
    public String getMessage() {
        return "You must be at least 18 years old";
    }
}

class OverAgeException extends Exception {
    public String getMessage() {
        return "You must be below 45 years old";
    }
}

class AgeChecker {
    int age;
    
    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        age = scan.nextInt();
    }
    
    public void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
        	UnderAgeException uae = new UnderAgeException();
            throw uae;
        } else if (age > 45) {
        	OverAgeException oae = new OverAgeException();
            throw oae;
        } else {
            System.out.println("Age verification successful");
        }
    }
}

class MatchFinder
{
	public void initiate()
	{
		AgeChecker ac = new AgeChecker();
		try {
			ac.acceptInput();
			ac.verify();
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } catch (OverAgeException e) {
            System.out.println(e.getMessage());
        }
	}
}

public class CustomException {
    public static void main(String[] args) {
        MatchFinder matchFinder = new MatchFinder();
        matchFinder.initiate();

    }
}
