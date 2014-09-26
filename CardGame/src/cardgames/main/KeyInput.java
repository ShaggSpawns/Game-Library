package cardgames.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cardgame.objects.GameObject;
import cardgame.objects.ObjectIDs;

public class KeyInput extends KeyAdapter {
	
	ObjectHandler oHandler;
	public KeyInput(ObjectHandler oHandler) {
		this.oHandler = oHandler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();


		for(int i = 0; i < oHandler.object.size(); i++) {
			GameObject tempObject = oHandler.object.get(i);
			
			if ( tempObject.getID() == ObjectIDs.Player) {
				if(key == KeyEvent.VK_UP) tempObject.setVelY(-3);
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(3);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(3);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(-3);
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < oHandler.object.size(); i++) {
			GameObject tempObject = oHandler.object.get(i);
			
			if ( tempObject.getID() == ObjectIDs.Player) {
				if(key == KeyEvent.VK_UP) tempObject.setVelY(0);
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(0);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
			}
		}
	}
}
