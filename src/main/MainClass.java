package main;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

import view.ViewDobbelSpel;
import view.ViewScherm;

public class MainClass {
	
	private ViewScherm scherm;
	
	public static ViewDobbelSpel viewDobbelSpel;
	
	public MainClass() {
		scherm = new ViewScherm(scherm, 1200, 700, Color.white, "Dobbelspel");
		
		viewDobbelSpel = new ViewDobbelSpel();
		int width =  (int) scherm.getWidth() * 50 / 100;
		int height = (int) scherm.getHeight() * 50 / 100;
		voegElementToe(scherm, viewDobbelSpel, 0, 0, width, height);
		
		scherm.setVisible(true);
	}
	
	
    public static void voegElementToe(JFrame frame, Component element, int x, int y, int width, int height) {
    	frame.getContentPane().add(element);
    	element.setBounds(x, y, width, height);
    }

	
	public static void main(String[] args) {
		new MainClass();
	}

}
