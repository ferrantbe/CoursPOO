package be.ephec.java.cours04.nim02.players;

import be.ephec.java.cours04.nim02.Pile;

public class SmartPlayer  extends AbstractPlayer {

    public SmartPlayer(String name) {
        super(name);
    }

    public void play(Pile pile, int max) {
        numberOfRemovedMatches = (pile.remainingNumberOfMatches() - 1) % (max + 1);
        if (numberOfRemovedMatches == 0)
            numberOfRemovedMatches = 1;
        pile.remove(numberOfRemovedMatches);
    }

}
