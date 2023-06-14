package com.udayproject.learnspringframework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
	class Uday{
		
	}
	@Component
	@Lazy
	class Reddy{
		private Uday uday;
		public Reddy(Uday  uday) {
			
			System.out.print("Some random output");
			this.uday = uday;
		}
		public void doSomething() {
			System.out.println("Do fucking something!!!!");
		}
	}

	@Configuration
	@ComponentScan

	public class LazyInitializationLauncherApplication  {
	  

		public static void main(String[] args) {
			
			
			try(var context = new AnnotationConfigApplicationContext
					(LazyInitializationLauncherApplication.class)) {
				System.out.println("Initilization is now completed");
				context.getBean(Reddy.class).doSomething();
				
				
			
			}
	}
	}
