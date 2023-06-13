package com.udayproject.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	//MarioGame game;
	 private GamingConsole game;
	public GameRunner ( @Qualifier("SuperContraGameQualifier")GamingConsole game) {
		this.game = game;
		
	}
	public void run() {
		System.out.println("RunningGame:"+  game);
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
