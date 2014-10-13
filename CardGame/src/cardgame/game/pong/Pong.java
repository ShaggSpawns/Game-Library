package cardgame.game.pong;

import java.awt.Color;

import cardgame.main.CardGame;
import cardgame.object.ObjectID;
import cardgame.object.Player;

public class Pong extends CardGame {
	private static final long serialVersionUID = -1158863663948004618L;

	public static Player p1 = new Player(200, 300, 32, 32, Color.BLUE, ObjectID.Player);
	public static Player p2 = new Player(200, 300, 32, 32, Color.WHITE, ObjectID.Player);
	int X_BOUND = CardGame.WIDTH;
	int Y_BOUND = CardGame.HEIGHT;
	
	public Pong() {
		InputHandler iHandler = new InputHandler();
		this.addKeyListener(iHandler);
		this.addMouseListener(iHandler);
		
		oHandler.addObject(p1);
		oHandler.addObject(p2);
	}
}
