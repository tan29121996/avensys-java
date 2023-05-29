package com.java.learnspringframework.XML;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.learnspringframework.game.GameRunner;

// Jakarta CDI - Context and Dependency Injection

public class XMLConfigurationContextApplication {

	public static void main(String[] args) {
		
		var context =
		new ClassPathXmlApplicationContext("contextConfiguration.xml");
		
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
			
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		context.getBean(GameRunner.class).run();
	}

}
