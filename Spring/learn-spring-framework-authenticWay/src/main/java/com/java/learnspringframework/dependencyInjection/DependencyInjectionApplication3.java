package com.java.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Dependency injection using Constructors

@Component
class Football {

	PlayerOne playerOne;
	
	PlayerTwo playerTwo;
	
	public Football(PlayerOne playerOne, PlayerTwo playerTwo) {
		super();
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
	
	public String toString() {
		return "Using " + playerOne + " and " + playerTwo + " dependencies";
	}
}

@Component
class PlayerOne {
	
}

@Component
class PlayerTwo {
	
}

@Configuration
@ComponentScan
public class DependencyInjectionApplication3 {

	public static void main(String[] args) {
		
		try(var context = 
		new AnnotationConfigApplicationContext(DependencyInjectionApplication3.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(JavaClass.class));
		}
		
		
	}

}
