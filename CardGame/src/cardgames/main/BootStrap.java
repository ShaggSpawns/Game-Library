package cardgames.main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BootStrap {
	private JButton button;
	public static JFrame frame;
	public BootStrap() {
		frame = new JFrame("BootStrap");
		frame.setSize(new Dimension(400, 200));
		button = new JButton("Start");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CardGame(Games.SPACE_INVADERS);
			}
		});
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CardGame(Games.SPACE_INVADERS);
		//new BootStrap();
	}
}
