package view;

import java.awt.Color;

import javax.swing.JFrame;

public class ViewScherm extends AbstractScherm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static JFrame scherm;
	
	public ViewScherm(JFrame frame, int schermBreedte, int schermHoogte, Color background, String name) {
		super(frame, schermBreedte, schermHoogte, background, name);
	}
	
}
