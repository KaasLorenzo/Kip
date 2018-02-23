package view;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import settings.Methods;

public class ViewDobbelSpel extends AbstractView{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7094795189978392854L;
	
	private JLabel dobbel1 = new JLabel("DOBBELSTEEN 1");
	private JLabel dobbel2 = new JLabel("Dobbelsteen 2");
	
	public ViewDobbelSpel() {
		Methods.voegLabelToe(dobbel1, 0, 0, 50, 40, true, this, SwingConstants.RIGHT);
		Methods.voegLabelToe(dobbel2, 0, 0, 50, 40, true, this, SwingConstants.LEFT);
	}
	
}
