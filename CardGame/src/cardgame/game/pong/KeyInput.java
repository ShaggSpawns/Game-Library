package cardgame.game.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
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

	@Override
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
}
