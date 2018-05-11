package org.theFirstGame.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import org.theFirstGame.model.Welt;

public class Spielpanel extends JPanel {

	private Welt welt;

	public static final int spielerXPosition = 50;
	private static final int spielerYPositionAufDemBoden = 300;
	private static final int spielerYPositionImSprung = 200;

	public Spielpanel(Welt welt) {
		this.welt = welt;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		komponenetenMalen(g);
	}

	private void komponenetenMalen(Graphics g) {
		g.drawLine(1, 350, welt.getWeltLaenge(), 350);
		g.drawRect(spielerXPosition, 350, 50, -50);
		for (int i = 0; i < welt.getGegner().size(); i++) {
			g.drawRect(welt.getGegner().get(i).getxPosition(), 350, 50, -50);
		}
		
		if (welt.getSpieler().springt()) {
			g.drawRect(spielerXPosition, spielerYPositionImSprung, 50, 50);
		} else {
			g.drawRect(spielerXPosition, spielerYPositionAufDemBoden, 50, 50);
		}
	}
}
