package be.ephec.java.cours04.nim;

public interface Player {
	String getName();

	int getNumberOfMatchesRemoved();

	void play(Pile p, int max);

	@Override
	String toString();

}
