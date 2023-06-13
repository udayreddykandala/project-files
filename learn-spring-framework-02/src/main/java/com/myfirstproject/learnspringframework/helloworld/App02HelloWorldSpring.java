package com.myfirstproject.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("city"));
		System.out.println(context.getBean("uday"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.print(context.getBean(Person.class));
		
		Arrays.stream(context.getBeanDefinitionNames())
		              .forEach(System.out::println);
		
		
		

	}

}
