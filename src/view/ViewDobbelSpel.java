package view;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import mechanic.NumberGenerator;
import settings.Methods;

public class ViewDobbelSpel extends AbstractView{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7094795189978392854L;
	
	private JLabel dobbel1 = new JLabel("DOBBELSTEEN 1: "+getNumberValue());
	private NumberGenerator numberGenerator;
//	private JLabel dobbel2 = new JLabel("Dobbelsteen 2");
	
	public ViewDobbelSpel() {
		Methods.voegLabelToe(dobbel1, 0, 0, 50, 40, true, this, SwingConstants.LEFT);
//		Methods.voegLabelToe(dobbel2, 0, 0, 50, 40, true, this, SwingConstants.LEFT);
	}
	
	public int getNumberValue() {
		numberGenerator = new NumberGenerator();
		int num = numberGenerator.getRandomNumber(1);
		return num;
	}
	
}
