package cardgames.games;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import cardgame.objects.Alien;
import cardgame.objects.ObjectIDs;
import cardgame.objects.Player;
import cardgames.main.CardGame;
import cardgames.main.ObjectHandler;


public class Space_Invaders implements KeyListener {
	ObjectHandler oHandler = CardGame.getObjectHandler();
	//List<Alien> alien = new ArrayList<Alien>();
	//Alien[] alien;
	Player p1 = new Player(200, 300, ObjectIDs.Player);
	int X_BOUND = CardGame.WIDTH;
	int Y_BOUND = CardGame.HEIGHT;
	
	public Space_Invaders() {
		oHandler.addObject(p1);
	}
	
	private void addAlien(int quantity) {
		
	}
	
	private Alien getAlien(int i) {
		return alien[i];
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 77) {
			p1.setVelY(3);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
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