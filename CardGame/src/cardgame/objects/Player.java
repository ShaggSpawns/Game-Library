package cardgame.objects;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {
	
	public Player(int x, int y, ObjectIDs id) {
		super(x, y, id);
	}

	public void tick() {
		x += getVelX();
		y += getVelY();
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
}