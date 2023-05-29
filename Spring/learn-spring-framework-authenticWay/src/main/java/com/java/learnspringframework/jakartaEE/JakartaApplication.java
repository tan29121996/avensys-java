package com.java.learnspringframework.jakartaEE;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessClass {
	private Data data;
	
	@Inject
	public void setData(Data data) {
		System.out.println("Setter injection");
		this.data = data;
	}
	
	public Data getData() {
		return data;
	}
}

@Named
class Data {
	
}

@Configuration
@ComponentScan
public class JakartaApplication {

	public static void main(String[] args) {
		
		try(var context = 
		new AnnotationConfigApplicationContext(JakartaApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessClass.class));
		}
		
	}

}
