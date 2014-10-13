package cardgame.object;

import java.awt.Color;
import java.awt.Graphics;

import javafx.scene.shape.Rectangle;

public class Ball extends GameObject {
	
	public Ball(int x, int y, int width, int height, Color color, ObjectID id) {
		super(x, y, width, height, color, id);
	}
	
	public Ball(Rectangle r, Color color, ObjectID id) {
		super((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight(), color, id);
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