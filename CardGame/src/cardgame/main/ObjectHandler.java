package cardgame.main;

import java.awt.Graphics;
import java.util.LinkedList;

import cardgame.object.GameObject;

public class ObjectHandler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	
	public void add(GameObject object) {
		this.object.add(object);
	}
	
	public void remove(GameObject object) {
		this.object.remove(object);
	}
	
	public void removeAll() {
		object.removeAll(object);
	}
}
