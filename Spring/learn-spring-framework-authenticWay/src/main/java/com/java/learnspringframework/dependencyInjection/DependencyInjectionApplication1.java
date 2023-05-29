package com.java.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Dependency injection using Fields

@Component
class SuperMarket {
	@Autowired
	CustomerOne customerOne;
	
	@Autowired
	CustomerTwo customerTwo;
	
	public String toString() {
		return "Using " + customerOne + " and " + customerTwo + " dependencies";
	}
}

@Component
class CustomerOne {
	
}

@Component
class CustomerTwo {
	
}

@Configuration
@ComponentScan
public class DependencyInjectionApplication1 {

	public static void main(String[] args) {
		
		try(var context = 
		new AnnotationConfigApplicationContext(DependencyInjectionApplication1.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(SuperMarket.class));
		}
		
		
	}

}
