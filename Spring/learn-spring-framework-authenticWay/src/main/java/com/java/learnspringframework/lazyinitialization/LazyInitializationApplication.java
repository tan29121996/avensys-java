package com.java.learnspringframework.lazyinitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class DemoOne { // Eager initialization
	
}

@Component
@Lazy
class DemoTwo { // Lazy initialization
	private DemoOne demoOne;
	
	public DemoTwo(DemoOne demoOne) {
		System.out.println("Initialization code");
		this.demoOne = demoOne;
	}
	
	public void display() {
		System.out.println("DemoTwo Class display");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		
		try(var context = 
		new AnnotationConfigApplicationContext(LazyInitializationApplication.class))
		{
			System.out.println("Initialization of the context is complete");
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			context.getBean(DemoTwo.class).display();
		}
		
		
	}

}
