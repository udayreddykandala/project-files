package com.udayproject.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component

public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("moving upwards");
	}
	
	
	public void down() {
		System.out.println("Going into the deep ");
	}
	
	public void right() {
		System.out.println("Go to the right side ");
	}
	
	public void left() {
		System.out.println("Go to the left side");
	}

}
