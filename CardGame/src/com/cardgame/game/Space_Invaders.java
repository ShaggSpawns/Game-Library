package com.cardgame.game;

import com.cardgame.main.Alien;
import com.cardgame.main.CardGame;
import com.cardgame.main.ID;
import com.cardgame.main.ObjectHandler;
import com.cardgame.main.Player;


public class Space_Invaders {
	ObjectHandler oHandler = CardGame.getObjectHandler();
	public Space_Invaders() {
		
		Alien a = new Alien(1280 / 2 - 16, 50, ID.Alien);
		oHandler.addObject(a);
		oHandler.addObject(new Player(1280 / 2 - 16, 720 - 100, ID.Player));
	}
}
