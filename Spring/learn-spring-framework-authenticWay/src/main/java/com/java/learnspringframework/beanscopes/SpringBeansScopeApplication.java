package com.java.learnspringframework.beanscopes;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class GeneralClass { // Singleton Design Pattern
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass { // Many object instances but only per container
	
}

@Configuration
@ComponentScan
public class SpringBeansScopeApplication {

	public static void main(String[] args) {
		
		try(var context = 
		new AnnotationConfigApplicationContext(SpringBeansScopeApplication.class))
		{
			System.out.println("Initialization of the context is complete");
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(GeneralClass.class));
			System.out.println(context.getBean(GeneralClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
		
	}

}
