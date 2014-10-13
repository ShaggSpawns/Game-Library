package cardgame.object;

import java.awt.Color;
import java.awt.Graphics;

import javafx.scene.shape.Rectangle;

public class Player extends GameObject {
	
	public Player(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}
	
	public Player(Rectangle r, Color color) {
		super((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight(), color);
	}

	public void tick() {
		x += getVelX();
		y += getVelY();
	}

	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}