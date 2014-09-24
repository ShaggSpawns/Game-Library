package cardgames.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameWindow extends Canvas {
	private static final long serialVersionUID = -240840600533728354L;
	private JButton button = new JButton("Stop");
	public static JFrame frame;
	
	public GameWindow(int width, int height, String title, final CardGame game) {
		frame = new JFrame(title);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.running = false;
				frame.setVisible(false);
				BootStrap.frame.setVisible(true);
				frame.dispose();
			}
		});
		//frame.add(button);
		frame.setVisible(true);
		game.start();
	}
}