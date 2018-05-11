package org.theFirstGame.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import org.theFirstGame.model.Welt;

public class Spielpanel extends JPanel {

	private Welt welt;

	public static final int spielerStandardYPosition = 300;
	public static final int spielerXPosition = 50;

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
		for (int i = 0; i < welt.getGegner().size(); i++) {
			g.drawRect(welt.getGegner().get(i).getxPosition(), 350, 10, -50);
		}

		g.drawRect(spielerXPosition, welt.getSpieler().getyPosition(), 50, 50);
	}
}
