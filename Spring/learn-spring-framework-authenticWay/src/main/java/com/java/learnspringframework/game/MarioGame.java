package com.java.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Service // if there is business logic in class
// @Controller // if there are controllers related to web apps and REST apis
// @Repository // If there is logic related to database
@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("Jumping");
	}
	
	public void down() {
		System.out.println("Going into a hole");
	}
	
	public void left() {
		System.out.println("Going back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
