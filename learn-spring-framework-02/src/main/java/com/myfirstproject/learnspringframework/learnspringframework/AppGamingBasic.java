package com.myfirstproject.learnspringframework.learnspringframework;

import com.udayproject.learnspringframework.game.GameRunner;
import com.udayproject.learnspringframework.game.MarioGame;
import com.udayproject.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		//var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
		
	}
	

}
