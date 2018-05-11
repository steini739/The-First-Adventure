package org.theFirstGame.view;

import javax.swing.JFrame;

import org.theFirstGame.model.Welt;

public class Fenster extends JFrame {
	
	Welt welt;
	
	private Spielpanel spielpanel;
	
	public Fenster(Welt welt) {
		this.welt = welt;
		setTitle("The First Adventure");
		spielpanel = new Spielpanel(welt);
		add(spielpanel);
		setSize(800, 500);
		setVisible(true);
	}
}
