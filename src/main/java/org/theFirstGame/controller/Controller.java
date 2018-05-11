package org.theFirstGame.controller;

import javax.swing.Timer;

import org.theFirstGame.model.SpielerAktionen;
import org.theFirstGame.view.Fenster;

public class Controller {
	
	Fenster fenster;

	private Timer t;
	
	public Controller(Fenster fenster) {
		this.fenster = fenster;
	}

	public void initialisiereListener() {
		fenster.addWindowListener(new SpielFensterListener());
	}
	
	public void verarbeiteSpielerAktion(SpielerAktionen spielerAktion) {
		
	}
	
}
