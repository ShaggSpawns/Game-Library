package cardgame.object;

import java.awt.Color;
import java.awt.Graphics;

import javafx.scene.shape.Rectangle;

public class Button extends GameObject {
	public Color tempColor;
	public Button(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
		tempColor = color;
		
	}
	
	public Button(Rectangle r, Color color) {
		super((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight(), color);
		tempColor = color;
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