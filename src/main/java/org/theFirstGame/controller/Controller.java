package org.theFirstGame.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.theFirstGame.model.SpielerAktionen;
import org.theFirstGame.view.Fenster;

public class Controller {
	
	Fenster fenster;

	private Timer t;
	private int delay = 40;
	
	public Controller(Fenster fenster) {
		this.fenster = fenster;
	}

	public void spielStarten() {
		t = new Timer(delay, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tickBerechnen();
			}
		});
	}
	
	private void tickBerechnen() {
		fenster.repaint();
	}
	
	public void initialisiereListener() {
		fenster.addWindowListener(new SpielFensterListener());
	}
	
	public void verarbeiteSpielerAktion(SpielerAktionen spielerAktion) {
		
	}
	
}
