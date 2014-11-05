package cardgame.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class CardGame extends Canvas implements Runnable {
	private static final long serialVersionUID = 1550691097823471818L;
	
	public static final int[] ASPECT_RATIO = {16, 9};
	public static final int HEIGHT = 720, WIDTH = HEIGHT * ASPECT_RATIO[0] / ASPECT_RATIO[1];
	
	private Thread mainThread;
	public boolean running = false;
	public JFrame frame;
	
	protected static ObjectHandler oHandler = new ObjectHandler();
	protected static Graphics graphics;
	private static Color backgroundColor = Color.BLACK;
	
	public CardGame() {
		frame = new JFrame("Card Games");
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(this);
		frame.setVisible(true);
		this.start();
	}
	
	public static void main(String[] args) {
		new cardgame.main.Pong();
	}
	
	public synchronized void start() {
		mainThread = new Thread(this);
		mainThread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			mainThread.join();
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
				System.out.println("FPS: " + "[" + frames + "]");
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
			this.createBufferStrategy(2);
			return;
		}
		
		graphics = buffStrategy.getDrawGraphics();
		
		graphics.setColor(backgroundColor);
		graphics.fillRect(0, 0, WIDTH, HEIGHT);
		
		oHandler.render(graphics);
		
		graphics.dispose();
		buffStrategy.show();
	}
	
	public static ObjectHandler getObjectHandler() {
		return oHandler;
	}
	
	public static void setBackgroundColor(Color backgroundColor) {
		CardGame.backgroundColor = backgroundColor;
	}
	
	public Color getBackgroundColor() {
		return backgroundColor;
	}
}