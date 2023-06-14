package com.udayproject.learnspringframework.example.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class DepInjectionLauncherApplication2 {
  

	public static void main(String[] args) {
		
		
		var context = new AnnotationConfigApplicationContext
				(DepInjectionLauncherApplication2.class);
		
		Arrays.stream(context.getBeanDefinitionNames())
		     .forEach(System.out::println);
	}
}


