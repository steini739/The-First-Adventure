package org.theFirstGame.model;

import org.theFirstGame.view.Spielpanel;

public class Spieler {

	private int yPosition;
	private int sprungPhase = 0;
	
	private static final int maximumSprungHoehe = Spielpanel.spielerStandardYPosition - 100;
	
	public static final int nichtSpringend = 0;
	public static final int springendAufsteigend = 1;
	public static final int springendAbsteigend = 2;
	
	public Spieler() {
		yPosition = Spielpanel.spielerStandardYPosition;
	}

	public void starteSpringen() {
		if (sprungPhase == 0) {
			sprungPhase = springendAufsteigend;
		}
	}
	
	public void springen() {
		if (sprungPhase == springendAufsteigend) {
			if (yPosition > maximumSprungHoehe) {
				yPosition = yPosition - 1;
			} else {
				sprungPhase = springendAbsteigend;
			}
		} else  if (sprungPhase == springendAbsteigend) {
			if (yPosition < Spielpanel.spielerStandardYPosition) {
				yPosition = yPosition + 1;
			} else {
				sprungPhase = nichtSpringend;
			}
		}
	}

	public int getyPosition() {
		return yPosition;
	}

}
