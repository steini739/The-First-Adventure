package org.theFirstGame.model;

public class Gegner {

	private int xPosition; 
	
	public Gegner(int weltLaenge) {
		xPosition = weltLaenge;
	}
	
	public void nachLinksBewegen() {
		xPosition = xPosition - 1;
	}

	public int getxPosition() {
		return xPosition;
	}
	
	
}
