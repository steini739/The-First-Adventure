package org.theFirstGame.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.theFirstGame.model.SpielerAktionen;

public class TastenEingabeListener implements KeyListener {

	private Controller c;

	public TastenEingabeListener(Controller c) {
		this.c = c;
	}

	public void keyPressed(KeyEvent e) {
		SpielerAktionen spielerAktion = SpielerAktionen.NICHTS;
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			spielerAktion = SpielerAktionen.SCHLAGEN;
			break;
		case KeyEvent.VK_W:
			spielerAktion = SpielerAktionen.SPRINGEN;
			break;
		default:
			spielerAktion = SpielerAktionen.NICHTS;
			break;
		}
		c.verarbeiteSpielerAktion(spielerAktion);
	}

	public void keyReleased(KeyEvent e) {
		// do nothing
	}

	public void keyTyped(KeyEvent e) {
		// do nothing
	}

}
