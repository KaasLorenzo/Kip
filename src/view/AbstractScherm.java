package view;

import java.awt.Color;

import javax.swing.JFrame;

public class AbstractScherm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AbstractScherm(JFrame frame, int schermBreedte, int schermHoogte, Color background, String name) {
		this.setSize(schermBreedte , schermHoogte);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setBackground(background);
		this.getContentPane().setBackground(background);
		this.setTitle(name);
	}
}
