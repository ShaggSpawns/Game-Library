package cardgame.game.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputHandler implements KeyListener, MouseListener {
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: // Left Arrow
			Pong.p2.setVelX(-1);
			break;
		case 38: // Up Arrow
			Pong.p2.setVelY(-1);
			break;
		case 39: // Right Arrow
			Pong.p2.setVelX(1);
			break;
		case 40: // Down Arrow
			Pong.p2.setVelY(1);
			break;
		case 87: // w
			Pong.p1.setVelY(-1);
			break;
		case 65: // a
			Pong.p1.setVelX(-1);
			break;
		case 68: // s
			Pong.p1.setVelX(1);
			break;
		case 83: // d
			Pong.p1.setVelY(1);
			break;
		default:
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: // Left Arrow
			Pong.p2.setVelX(0);
			break;
		case 38: // Up Arrow
			Pong.p2.setVelY(0);
			break;
		case 39: // Right Arrow
			Pong.p2.setVelX(0);
			break;
		case 40: // Down Arrow
			Pong.p2.setVelY(0);
			break;
		case 87: // w
			Pong.p1.setVelY(0);
			break;
		case 65: // a
			Pong.p1.setVelX(0);
			break;
		case 68: // s
			Pong.p1.setVelX(0);
			break;
		case 83: // d
			Pong.p1.setVelY(0);
			break;
		default:
			break;
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		Pong.p1.setX(e.getX());
		Pong.p1.setY(e.getY());
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}
