package com.udayproject.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	
	
	public void down() {
		System.out.println("Go into the home ");
	}
	
	public void right() {
		System.out.println("Go to the right ");
	}
	
	public void left() {
		System.out.println("Go to the left");
	}

}
