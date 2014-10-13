package cardgame.game.pong;

import java.awt.Color;

import cardgame.main.CardGame;
import cardgame.object.Ball;
import cardgame.object.ObjectID;
import cardgame.object.Player;

public class Pong extends CardGame {
	private static final long serialVersionUID = -1158863663948004618L;

	public static Player p1 = new Player(12, (HEIGHT /2 - 60), 24, 120, Color.BLACK, ObjectID.Player);
	public static Player p2 = new Player((WIDTH - 36), (HEIGHT /2 - 60), 24, 120, Color.BLACK, ObjectID.Player);
	public static Ball ball = new Ball((WIDTH / 2 - 14), (HEIGHT /2 - 16), 32, 32, Color.GRAY, ObjectID.Ball);
	int X_BOUND = CardGame.WIDTH;
	int Y_BOUND = CardGame.HEIGHT;
	
	public Pong() {
		InputHandler iHandler = new InputHandler();
		this.addKeyListener(iHandler);
		this.addMouseListener(iHandler);
		this.addMouseMotionListener(iHandler);
		
		oHandler.add(p1);
		oHandler.add(p2);
		oHandler.add(ball);
	}
}
