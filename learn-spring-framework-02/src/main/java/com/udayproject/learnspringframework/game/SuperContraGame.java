package com.udayproject.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Go up bitch");
	}
	
	
	public void down() {
		System.out.println("Go into the down bitch ");
	}
	
	public void right() {
		System.out.println("Go to the right  bitch");
	}
	
	public void left() {
		System.out.println("Go to the left bitch");
	}

}
