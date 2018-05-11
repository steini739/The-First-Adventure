package org.theFirstGame.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.theFirstGame.model.SpielerAktionen;
import org.theFirstGame.model.Welt;
import org.theFirstGame.view.Fenster;

public class Controller {
	
	Fenster fenster;
	Welt welt;

	private Timer t;
	private Timer gegnerSpawntimer;
	private int delay = 4;
	private int gegnerSpawnDelay = 2000;
	
	public Controller(Fenster fenster, Welt welt) {
		this.fenster = fenster;
		this.welt = welt;
	}

	public void spielStarten() {
		t = new Timer(delay, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tickBerechnen();
			}
		
		});
		t.start();
		gegnerStarten();
	}

	public void gegnerStarten() {
		gegnerSpawntimer = new Timer(gegnerSpawnDelay, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				welt.gegnerSpawnen();
			}
			
		});
		gegnerSpawntimer.start();
	}
	
	private void tickBerechnen() {
		fenster.repaintSpielPanel();
		welt.gegnerBewegen();
	}
	
	public void initialisiereListener() {
		fenster.addWindowListener(new SpielFensterListener());
		fenster.addKeyListener(new TastenEingabeListener(this));
	}
	
	public void verarbeiteSpielerAktion(SpielerAktionen spielerAktion) {
		switch (spielerAktion) {
		case SPRINGEN:
			//TODO aktionen hinzufügen
			break;

		default:
			break;
		}
	}
	
}
