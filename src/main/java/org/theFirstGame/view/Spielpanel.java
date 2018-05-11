package org.theFirstGame.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import org.theFirstGame.model.Welt;

public class Spielpanel extends JPanel {

	private Welt welt;

	private static final int spielerXPosition = 50;
	private static final int spielerYPositionAufDemBoden = 300;
	private static final int spielerYPositionImSprung = 200;

	public Spielpanel(Welt welt) {
		this.welt = welt;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		komponenetenMalen(g);
		System.out.println("Test");
	}

	private void komponenetenMalen(Graphics g) {
		g.drawLine(1, 350, 800, 350);
		if (welt.getSpieler().springt()) {
			g.drawRect(spielerXPosition, spielerYPositionImSprung, 50, 50);
		} else {
			g.drawRect(spielerXPosition, spielerYPositionAufDemBoden, 50, 50);
		}
	}
}
