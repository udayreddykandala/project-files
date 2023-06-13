package com.myfirstproject.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name ,int age, String address) {
	
};


@Configuration
public class HelloWorldConfiguration {

		@Bean
		
		public String name() {
			return "uday";
		}
		@Bean
		public int age() {
			return 27;
		}
		@Bean
		public String city() {
			return "Dublin";
		}
		@Bean(name = "uday")
		public Person person1() {
			return new Person("uday", 24,"banker street,Dublin15");
		}
		@Bean(name = "uday1")
		@Primary
		public Person person() {
			return new Person("uday", 24,"banker street,Dublin15");
		}
		@Bean
		public String address() {
			return ("CITY BANK,DUBLIN");
		}
		@Bean
		public Person person2MethodCall() {
			return new Person(name(), age(),address());
			
		}
		@Bean
		public Person person3Parameters(String name,int age,String address) {
			return new Person(name, age,address);
		}
	}
