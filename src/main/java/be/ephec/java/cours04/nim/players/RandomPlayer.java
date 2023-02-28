package be.ephec.java.cours04.nim.players;

import be.ephec.java.cours04.nim.Pile;

import java.util.Random;

public class RandomPlayer  extends AbstractPlayer {

    public RandomPlayer(String name) {
        super(name);
    }

    public void play(Pile pile, int max) {
        numberOfRemovedMatches = new Random().nextInt(3) + 1;
        if (pile.remainingNumberOfMatches() < numberOfRemovedMatches)
            numberOfRemovedMatches = pile.remainingNumberOfMatches();

        pile.remove(numberOfRemovedMatches);
    }

}
