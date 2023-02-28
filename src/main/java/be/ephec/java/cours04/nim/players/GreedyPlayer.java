package be.ephec.java.cours04.nim.players;

import be.ephec.java.cours04.nim.Pile;

public class GreedyPlayer extends AbstractPlayer  {

    public GreedyPlayer(String name) {
        super(name);
    }

    public void play(Pile pile, int max) {
        if (pile.remainingNumberOfMatches() < max)
            numberOfRemovedMatches = pile.remainingNumberOfMatches();
        else
            numberOfRemovedMatches = max;

        pile.remove(numberOfRemovedMatches);
    }

}
