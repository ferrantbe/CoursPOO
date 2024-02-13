package be.ephec.java.cours04.nim02;

public interface Player {
	String getName();

	int getNumberOfMatchesRemoved();

	void play(Pile p, int max);

	@Override
	String toString();

}
