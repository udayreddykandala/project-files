package com.myfirstproject.learnspringframework;

import java.io.Serializable;

class Pojo{
	private String text;
	private int number;
	public String toString() {
		return text+"."+ number;
	}
}
//This is a JavaBean

class JavaBean  implements Serializable {
	
	//public no-arg constructor
	public JavaBean() {
		
	}
	public String text;
	public  int number;
	
	//getters and setters 
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}

public class SpringBeanVsJavaBean {
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.print(pojo);
		
		
	}

}
