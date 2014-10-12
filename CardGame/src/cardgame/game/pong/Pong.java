package cardgame.game.pong;

import cardgame.main.CardGame;
import cardgame.object.ObjectIDs;
import cardgame.object.Player;

public class Pong extends CardGame {
	private static final long serialVersionUID = -1158863663948004618L;

	public static Player p1 = new Player(200, 300, ObjectIDs.Player);
	public static Player p2 = new Player(200, 300, ObjectIDs.Player);
	int X_BOUND = CardGame.WIDTH;
	int Y_BOUND = CardGame.HEIGHT;
	
	public Pong() {
		this.addKeyListener(new KeyInput());
		oHandler.addObject(p1);
		oHandler.addObject(p2);
	}
}
