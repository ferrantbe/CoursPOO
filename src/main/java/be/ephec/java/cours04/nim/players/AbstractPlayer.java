package be.ephec.java.cours04.nim.players;

import be.ephec.java.cours04.nim.Pile;
import be.ephec.java.cours04.nim.Player;

/**
 * Un joueur du jeu de Nim
 * 
 * @author fredericferrant
 *
 */
public abstract class AbstractPlayer implements Player {
	private String name;
	protected int numberOfRemovedMatches;

	public AbstractPlayer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getNumberOfMatchesRemoved() {
		return numberOfRemovedMatches;
	}

	@Override
	public abstract void play(Pile p, int nbMax) ;

	@Override
	public String toString() {
		return name + " a pris " + numberOfRemovedMatches + " allumette(s)";
	}

}
