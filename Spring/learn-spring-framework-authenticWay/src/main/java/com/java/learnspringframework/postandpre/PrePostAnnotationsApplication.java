package com.java.learnspringframework.postandpre;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class NormalClass {
	private Dependency dependency;

	public NormalClass(Dependency dependency) {
		super();
		this.dependency = dependency;
		System.out.println("Dependencies are ready");
	} 
	
	@PostConstruct // After construction of beans
	public void initialize() { 
		dependency.getReady();
	}
	
	@PreDestroy // Before beans are destroyed
	public void cleanup() {
		dependency.cleanup();
	}
	
}

@Component
class Dependency {
	public void getReady() {
		System.out.println("Some logic using dependency");
	}
	
	public void cleanup() {
		System.out.println("Clean up the beans");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationsApplication {

	public static void main(String[] args) {
		
		try(var context = 
		new AnnotationConfigApplicationContext(PrePostAnnotationsApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			context.getBean(NormalClass.class).initialize();
			context.getBean(NormalClass.class).cleanup();
		}
		
	}

}
