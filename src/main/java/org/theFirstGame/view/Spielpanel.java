package org.theFirstGame.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import org.theFirstGame.model.Welt;

public class Spielpanel extends JPanel {
	
	private Welt welt;
	
	private static final int spielerXPosition = 50;

	public Spielpanel(Welt welt) {
		this.welt = welt;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		komponenetenMalen(g);
	}

	private void komponenetenMalen(Graphics g) {
		g.drawLine(1, 350, 800, 350);
		g.drawRect(spielerXPosition, 300, 50, 50);
	}
}
