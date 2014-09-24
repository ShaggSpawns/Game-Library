package cardgame.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject {
	Random r = new Random();
	public Alien(int x, int y, ObjectIDs id) {
		super(x, y, id);
	}

	public void tick() {
		x += getVelX();
		y += getVelY();
	}

	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 32);
	}
}