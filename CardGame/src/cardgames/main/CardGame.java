package cardgames.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import cardgame.objects.ObjectIDs;
import cardgame.objects.Player;
import cardgames.games.Space_Invaders;

public class CardGame extends Canvas implements Runnable {
	private static final long serialVersionUID = 1550691097823471818L;
	
	public static final int[] ASPECT_RATIO = {16, 9};
	public static final int HEIGHT = 720, WIDTH = HEIGHT * ASPECT_RATIO[0] / ASPECT_RATIO[1];
	
	private Thread thread;
	public boolean running = false;
	
	private static ObjectHandler oHandler;
	
	public CardGame(Games game) {
		oHandler = new ObjectHandler();
		this.addKeyListener(new KeyInput(oHandler));
		new GameWindow(WIDTH, HEIGHT, "Card Game", this);
		
		switch(game) {
		case WAR:
			new cardgames.games.War();
			break;
		case SPEED:
			new cardgames.games.Speed();
			break;
		case SPACE_INVADERS:
			new Space_Invaders();
			break;
		default:
			break; 
		}
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		long lastLoopTime = System.nanoTime();
		final int TARGET_FPS = 60;
		final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastLoopTime) / (double)OPTIMAL_TIME;
			lastLoopTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running) {
				render();
			}
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick() {
		oHandler.tick();
	}
	
	private void render() {
		BufferStrategy buffStrategy = this.getBufferStrategy();
		if(buffStrategy == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics graphics = buffStrategy.getDrawGraphics();
		
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, WIDTH, HEIGHT);
		
		oHandler.render(graphics);
		
		graphics.dispose();
		buffStrategy.show();
	}
	
	public static ObjectHandler getObjectHandler() {
		return oHandler;
	}
	
	public void initializeWar() {
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			oHandler.addObject(new Player(r.nextInt(1280), r.nextInt(720), ObjectIDs.Player));
		}
	}
	
	public void initializeSpeed() {
		oHandler.addObject(new Player(190, 190, ObjectIDs.Player));
	}
}