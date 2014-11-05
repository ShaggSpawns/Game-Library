package cardgame.main;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import cardgame.object.Ball;
import cardgame.object.Button;
import cardgame.object.GameObject;
import cardgame.object.PButton;
import cardgame.object.Player;

public class Pong extends CardGame implements KeyListener, MouseListener {
	private static final long serialVersionUID = -1158863663948004618L;

	public static Player p1 = new Player(12, (HEIGHT /2 - 60), 24, 120, Color.BLACK);
	public static Player p2 = new Player((WIDTH - 36), (HEIGHT /2 - 60), 24, 120, Color.BLACK);
	public static Ball ball = new Ball((WIDTH / 2 - 14), (HEIGHT /2 - 16), 32, 32, Color.GRAY);
	public static Button button = new Button(200, 200, 200, 200, Color.blue);
	int X_BOUND = CardGame.WIDTH;
	int Y_BOUND = CardGame.HEIGHT;
	
	public Pong() {
		this.addKeyListener(this);
		this.addMouseListener(this);
		cardgame.main.CardGame.setBackgroundColor(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
		
		oHandler.add(p1);
		oHandler.add(p2);
		oHandler.add(ball);
		oHandler.add((GameObject)new PButton("Elf"));
		
	}
	
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 38: // Up Arrow
			if (Pong.p2.getY() > 0) {
				Pong.p2.setVelY(-6);
			} else {
				Pong.p2.setVelY(0);
				Pong.p2.setY(0);
			}
			break;
		case 40: // Down Arrow
			if (Pong.p2.getY() < (CardGame.HEIGHT - Pong.p1.getHeight())) {
				Pong.p2.setVelY(6);
			} else {
				Pong.p2.setVelY(0);
				Pong.p2.setY((CardGame.HEIGHT - Pong.p1.getHeight()));
			}
			break;
		case 87: // w
			if (Pong.p1.getY() > 0) {
				Pong.p1.setVelY(-6);
			} else {
				Pong.p1.setVelY(0);
				Pong.p1.setY(0);
			}
			break;
		case 83: // s
			if (Pong.p1.getY() < (CardGame.HEIGHT - Pong.p1.getHeight())) {
				Pong.p1.setVelY(6);
			} else {
				Pong.p1.setVelY(0);
				Pong.p1.setY((CardGame.HEIGHT - Pong.p1.getHeight()));
			}
			break;
		default:
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 38: // Up Arrow
			Pong.p2.setVelY(0);
			break;
		case 40: // Down Arrow
			Pong.p2.setVelY(0);
			break;
		case 87: // w
			Pong.p1.setVelY(0);
			break;
		case 83: // s
			Pong.p1.setVelY(0);
			break;
		default:
			break;
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		/*if (e.getButton() == 1) {
			Pong.p1.setY(e.getY());
		} else {
			Pong.p2.setY(e.getY());
		}*/
		if (e.getX() >= button.getX() && e.getX() <= button.getX() + button.getWidth() && e.getY() >= button.getY() && e.getY() <= button.getY() + button.getHeight()) {
			button.setColor(Color.GRAY);
		}
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getX() >= button.getX() && e.getX() <= button.getX() + button.getWidth() && e.getY() >= button.getY() && e.getY() <= button.getY() + button.getHeight()) {
			button.setColor(button.tempColor);
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}
