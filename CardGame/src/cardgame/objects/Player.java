package cardgame.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {
	Random r = new Random();
	public Player(int x, int y, ObjectIDs id) {
		super(x, y, id);
	}

	public void tick() {
		/*if (r.nextInt(2) == 1) {
			x += r.nextInt(10);
			y += r.nextInt(10);
		} else {
			x -= r.nextInt(10);
			y -= r.nextInt(10);
		}*/
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
}