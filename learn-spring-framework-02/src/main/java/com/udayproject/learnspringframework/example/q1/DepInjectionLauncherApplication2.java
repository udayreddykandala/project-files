package com.udayproject.learnspringframework.example.q1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusiness{
	//Field  dependency Injection
	
	Dependency1  Dependency1;

	Dependency2 Dependency2;
	@Autowired //Autowired is not mandatory.
	public YourBusiness (Dependency1 dependency1, Dependency2 dependency2){ 
	          super();
	          System.out.println("Constructor Injection -Dependency");
	          this.Dependency1 = dependency1;
	          this.Dependency2 = dependency2;
	}
	
		//Field  dependency Injection
		
		
//Setter dependency Injection
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection -Dependency1");
		this.Dependency1 = dependency1;
	}



	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection -Dependency2");
		this.Dependency2 = dependency2;
	}




	public String toString() {
		return "Using " + Dependency1 + "and " + Dependency2;
		
	}
	
	
	
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan

public class DepInjectionLauncherApplication2 {
	
  

	public static void main(String[] args) {
		
		
		var context = new AnnotationConfigApplicationContext
				(DepInjectionLauncherApplication2.class);
		
		Arrays.stream(context.getBeanDefinitionNames())
		     .forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusiness.class));
	}

}


