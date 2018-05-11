package org.theFirstGame.model;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Welt {

	private Spieler spieler;
	private ArrayList<Gegner> gegner;
	
	private int weltLaenge = 800;

	public Welt() {
		spieler = new Spieler();
		gegner = new ArrayList<Gegner>();
		gegnerSpawnen();
	}
	
	public void gegnerSpawnen(){
		Gegner g = new Gegner(weltLaenge);
		gegner.add(g);
	}
	
	public void gegnerBewegen() {
		for (int i = 0;i <= gegner.size(); i++)
		{
			gegner.get(i).nachLinksBewegen();
		}
	}
	
	public ArrayList<Gegner> getGegner() {
		return gegner;
	}

	public Spieler getSpieler() {
		return spieler;
	}
	
	public int getWeltLaenge() {
		return weltLaenge;
	}
}
