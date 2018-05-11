package org.theFirstGame;

import org.theFirstGame.controller.Controller;
import org.theFirstGame.model.Welt;
import org.theFirstGame.view.Fenster;

public class Start {

	public static void main(String[] args) {
		Welt welt = new Welt();
		Fenster fenster = new Fenster(welt);
		Controller controller = new Controller(fenster, welt);
		controller.initialisiereListener();
		controller.spielStarten();
	}
}
