package cardgame.object;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {
	protected int x, y, width, height, velX, velY;
	protected Color color;
	
	public GameObject(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	
	// Setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	// Getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getVelX() {
		return velX;
	}
	public int getVelY() {
		return velY;
	}
	public Color getColor() {
		return color;
	}
}
