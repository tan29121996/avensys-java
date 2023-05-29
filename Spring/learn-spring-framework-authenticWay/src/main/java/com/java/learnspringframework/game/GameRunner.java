package com.java.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

interface GamingConsole {
	
	void up();
	void down();
	void left();
	void right();
}

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(@Qualifier("PacManGameQualifier") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running the game: " + game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
}

