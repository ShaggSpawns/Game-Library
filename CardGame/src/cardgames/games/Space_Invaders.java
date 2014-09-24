package cardgames.games;

import cardgame.objects.Alien;
import cardgame.objects.ObjectIDs;
import cardgame.objects.Player;
import cardgames.main.CardGame;
import cardgames.main.GameWindow;
import cardgames.main.ObjectHandler;


public class Space_Invaders {
	ObjectHandler oHandler = CardGame.getObjectHandler();
	public Space_Invaders() {
		int SPACING = 64;
		Alien a1 = new Alien(0, 50, ObjectIDs.Alien);
		Alien a2 = new Alien((SPACING += SPACING), 50, ObjectIDs.Alien);
		Alien a3 = new Alien((SPACING += SPACING), 50, ObjectIDs.Alien);
		Alien a4 = new Alien((SPACING += SPACING), 50, ObjectIDs.Alien);
		Alien a5 = new Alien((SPACING += SPACING), 50, ObjectIDs.Alien);
		a1.setVelX(2);
		a2.setVelX(2);
		a3.setVelX(2);
		a4.setVelX(2);
		a5.setVelX(2);
		oHandler.addObject(a1);
		oHandler.addObject(a2);
		oHandler.addObject(a3);
		oHandler.addObject(a4);
		oHandler.addObject(a5);
		oHandler.addObject(new Player(1280 / 2 - 16, 720 - 100, ObjectIDs.Player));
	}
	
	private void addAliens(int quantity) {
		for (int i = 0; i < quantity; i++) {
			oHandler.addObject(new Alien(0, 50, ObjectIDs.Alien));
		}
	}
}
