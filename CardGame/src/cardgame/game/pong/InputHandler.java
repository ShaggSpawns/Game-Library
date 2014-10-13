package cardgame.game.pong;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javafx.scene.input.MouseButton;
import cardgame.main.CardGame;

public class InputHandler implements KeyListener, MouseListener, MouseMotionListener {
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 38: // Up Arrow
			if (Pong.p2.getY() > 0) {
				Pong.p2.setVelY(-3);
			} else {
				Pong.p2.setVelY(0);
				Pong.p2.setY(0);
			}
			break;
		case 40: // Down Arrow
			if (Pong.p2.getY() < (CardGame.HEIGHT - Pong.p1.getHeight())) {
				Pong.p2.setVelY(3);
			} else {
				Pong.p2.setVelY(0);
				Pong.p2.setY((CardGame.HEIGHT - Pong.p1.getHeight()));
			}
			break;
		case 87: // w
			if (Pong.p1.getY() > 0) {
				Pong.p1.setVelY(-3);
			} else {
				Pong.p1.setVelY(0);
				Pong.p1.setY(0);
			}
			break;
		case 83: // s
			if (Pong.p1.getY() < (CardGame.HEIGHT - Pong.p1.getHeight())) {
				Pong.p1.setVelY(3);
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
		cardgame.main.CardGame.setBackgroundColor(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
		/*if (e.getButton() == 1) {
			Pong.p1.setY(e.getY());
		} else {
			Pong.p2.setY(e.getY());
		}*/
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON2) {
			Pong.p1.setY(e.getY());
		} else if (e.getButton() == MouseEvent.BUTTON1){
			Pong.p2.setY(e.getY());
		}
	}

	public void mouseMoved(MouseEvent e) {
	}
}
