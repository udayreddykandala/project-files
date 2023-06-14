package com.udayproject.learnspringframework.example.j1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cdiLauncherApplication3 {
  

	public static void main(String[] args) {
		
		
		var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");

		Arrays.stream(context.getBeanDefinitionNames())
		     .forEach(System.out::println);
		System.out.print(context.getBean("name"));
	}
}


