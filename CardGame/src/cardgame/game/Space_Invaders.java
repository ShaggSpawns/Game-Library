package cardgame.game;

import cardgame.main.CardGame;
import cardgame.main.ObjectHandler;
import cardgame.object.ObjectIDs;
import cardgame.object.Player;


public class Space_Invaders {
	ObjectHandler oHandler = CardGame.getObjectHandler();
	//List<Alien> alien = new ArrayList<Alien>();
	//Alien[] alien;
	Player p1 = new Player(200, 300, ObjectIDs.Player);
	int X_BOUND = CardGame.WIDTH;
	int Y_BOUND = CardGame.HEIGHT;
	
	public Space_Invaders() {
		oHandler.addObject(p1);
	}
}
/*public Space_Invaders() {
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
}*/